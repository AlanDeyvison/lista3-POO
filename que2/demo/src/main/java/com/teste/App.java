import com.teste.*;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner cin = new Scanner(System.in);
        int escolha;
        Robo robo = new Robo(1); //passar o passo 1 como parametro.
        Mapa mapa = new Mapa();

        System.out.println("robôzildo:");

        do{

            mapa.mapear(robo);
            robo.mostrarPosicao();

            System.out.println("(1) andar para frente");
            System.out.println("(2) andar para trás");
            System.out.println("(3) andar para direita");
            System.out.println("(4) andar para esquerda");
            System.out.println("(5) mudar passo");
            System.out.println("(6) fechar");

            escolha = cin.nextInt();

            switch(escolha){

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
                    int nPasso = cin.nextInt();

                    if(nPasso > 0){
                        robo.setPasso(nPasso);
                        System.out.println("feito.");
                    }else{
                        System.out.println("não dá para o passo ser 0");
                    }

                    break;

                case 6:
                    System.out.println("tchau!");
                    break;
                
                default:
                    System.out.println("opção invalida");
            }
            
        }while(escolha != 6);

        cin.close();


    }
}
