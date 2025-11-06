import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        int escolha = 0;

        Robot robo = new Robot(1); //passar o passo 1 como parametro.
        Local mapa = new Local();

        System.out.println("robôzildo:");

        do {
            mapa.mapear(robo);
            robo.mostrarPosicao();

            System.out.println("(1) andar para frente");
            System.out.println("(2) andar para trás");
            System.out.println("(3) andar para direita");
            System.out.println("(4) andar para esquerda");
            System.out.println("(5) mudar passo");
            System.out.println("(6) fechar");

            // verificar se a entrada é inteiro
            if (cin.hasNextInt()) {
                escolha = cin.nextInt();
            } else {
                System.out.println("Por favor, digite um número inteiro.");
                cin.next(); // limpar entrada inválida
                continue; // ignora todoresto volta para o início do loop por está errado
            }

            try {
                switch (escolha) {
                    case 1:
                        robo.andarFrente();
                        break;

                    case 2:
                        robo.andarTras();
                        break;

                    case 3:
                        robo.andarDireita();
                        break;

                    case 4:
                        robo.andarEsquerda();
                        break;

                    case 5:
                        System.out.println("tamanho do passo:");
                        if (cin.hasNextInt()) {
                            int nPasso = cin.nextInt();
                            if (nPasso > 0) {
                                robo.setPasso(nPasso);
                                System.out.println("feito.");
                            } else {
                                System.out.println("não dá para o passo ser 0 ou negativo");
                            }
                        } else {
                            System.out.println("errado. digite um número inteiro.");
                            cin.next(); // limpa a entrada inválida
                        }
                        break;

                    case 6:
                        System.out.println("tchau!");
                        break;

                    default:
                        System.out.println("opção invalida");
                }
            } catch (Exception e) {
                System.out.println("ocorreu um erro: " + e.getMessage());
            }
        } while (escolha != 6);

        cin.close();
    }
}