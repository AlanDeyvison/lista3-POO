import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ranking {
    private List<Player> rank = new ArrayList<>();
    private final String ARQUIVO = "ranking.txt"; // caminho relativo

    public void load() throws IOException {
        rank.clear();
        File file = new File(ARQUIVO);


        if(!file.exists()){ // ver se arquivo não existir
            System.out.println("arquivo não encontrado (criando um...)");
            file.createNewFile(); // criar o arquivo se não existir
            return;
        }

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String row;

            while((row = br.readLine())!=null){
                String[] textParts = row.split("-");
                if(textParts.length == 2){
                    String nome = textParts[0].trim(); //pego o user e tiro os espaços em branco dos dois lados
                    int vitorias = Integer.parseInt(textParts[1].trim()); //transformo em inteiro e corto os espços em branco
                    Player p = new Player(nome, 0);
                    for(int i = 0; i <vitorias; i++){//add numeros de vitorias
                        p.addVitoria();
                    }
                    rank.add(p); // add player no rank
                }

                //fazer a classe pra ordenar  e add aqui
                ordenar();
            }

        } catch (IOException  | NumberFormatException e){
            System.out.println("erro ao ler: " + e.getMessage());
        }
    }

    public void save() throws IOException {
        File file = new File(ARQUIVO);

        // CORREÇÃO: Garantir que o arquivo existe antes de salvar
        if(!file.exists()){
            file.createNewFile();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for(Player p : rank){
                bw.write(p.getUser() + "-" + p.getVitorias());
                bw.newLine();
            }
            System.out.println("ranking salvo!");
        }catch (IOException e){
            System.out.println("erro na gravação de arquivo: " + e.getMessage());
        }
    }

    public void update(Player player) throws IOException {
        Player existente = null; //verificar se existe player
        for (Player p: rank){
            if (p.getUser().equalsIgnoreCase(player.getUser())){
                existente = p;
                break;
            }
        }

        if (existente != null){
            existente.addVitoria();
        }else{
            player.addVitoria();
            rank.add(player);
        }

        ordenar();
        save();
    }

    public void showTop5(){
        System.out.println("top 5:");
        if(rank.isEmpty()){
            System.out.println("ninguem registrado");
            return;
        }

        for(int i = 0; i < Math.min(5, rank.size()); i++) {
            Player p = rank.get(i);
            System.out.println((i + 1) + "-" + p.getUser() + ": " + p.getVitorias());

        }
    }

    private void ordenar(){
        rank.sort((a, b) -> Integer.compare(b.getVitorias(), a.getVitorias()));
    }

    public boolean existeJogador(String nome) {
        for (Player p : rank) {
            if (p.getUser().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public Player buscarJogador(String nome) {//buscar o jogador pelo nome
        for (Player p : rank) {
            if (p.getUser().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

}



