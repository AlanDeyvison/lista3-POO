import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Player> players = new ArrayList<>();
    private Dados d1 = new Dados();
    private Dados d2 = new Dados();
    private Ranking ranking  = new Ranking();
    private final int MAXPLAYERS = 11;

    public void iniciarJogo() throws IOException {
        Scanner cin = new Scanner(System.in);
        ranking.load();
        ranking.showTop5();

        int qtd;

        try {
            do {
                System.out.println("quantos jogadores? (1-11)? ");
                qtd = cin.nextInt();
            } while (qtd < 1 || qtd > MAXPLAYERS);

            cin.nextLine();

            for (int i = 0; i < qtd; i++) {
                System.out.print("\nDigite o nome do jogador " + (i + 1) + ": ");
                String nome = cin.nextLine();

                boolean repetido = false;

                // Verifica na lista de jogadores atuais
                for (Player p : players) {
                    if (p.getUser().equalsIgnoreCase(nome)) {
                        repetido = true;
                        break;
                    }
                }

                // se não encontrou na lista atual, verifica no ranking
                if (!repetido) {
                    repetido = ranking.existeJogador(nome);
                }

                if (repetido) {
                    System.out.println("ja existe esse nome. tenta outro");
                    i--;
                    continue;
                }

                int aposta;
                do {
                    System.out.println("sua aposta (2 a 12): ");
                    aposta = cin.nextInt();
                } while (aposta < 2 || aposta > 12);
                cin.nextLine();

                players.add(new Player(nome, aposta));
            }
        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }

        int soma = lancarDados();
        System.out.println();
        System.out.println("resultado dados: " + soma);

        verificarVencedor(soma);
    }

    public int lancarDados(){
        return  d1.girarDado() + d2.girarDado();
    }

    public void verificarVencedor(int soma) throws IOException {
        boolean houveVencedor = false;


        for (Player p : players){
            if(p.getApostas() == soma ){
                System.out.println(p.getUser() + " venceu!");
                ranking.update(p);
                houveVencedor = true;

            }
        }
        if(!houveVencedor){
            System.out.println("maquina venceu!");
        }
    }

}
