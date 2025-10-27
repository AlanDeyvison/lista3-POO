import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static List<Pedido> pedidos = new ArrayList<>(); // pegando pedido
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        int opcao;
        
        do{
            System.out.println("cliente(1), atendente(2), sair(3): ");
            opcao = cin.nextInt();
            cin.nextLine();

            switch (opcao) {
                case 1:

                    Pedido novoPedido = new Pedido();
                    novoPedido.fazerPedido();
                    pedidos.add(novoPedido);

                    break;

                case 2: 
                
                    // lembrar de colocar dentro de um metodo depois, para ficar menos poluido

                    System.out.println("Confirmar entrega(1), Ver pedidos confirmados(2), Ver pedidos entregues(3): ");
                    int opcaoAtendente = cin.nextInt();
                    cin.nextLine();

                    switch (opcaoAtendente) {
                        case 1:
                            confirmar(); //encapsulando em metodos para ficar menos poluido
                            break;
                        case 2:
                            verConfirmados();
                            break;
                        case 3:
                            verEntregues();
                            break;
                        default:
                            System.out.println("opção invalida");
                    
                    }

                    break;
                
                case 3:
                    break;

                default:
                    System.out.println("opção inválida.");
            }

        }while (opcao != 3);

        cin.close();
    }





    public static void confirmar() {
        System.out.print("Digite o código do pedido: ");
        int codigo = cin.nextInt(); 
        cin.nextLine();
        
        boolean encontrado = false;

        for (Pedido pedido : pedidos) { //procurar codigo
            if (pedido.getCodigo() == codigo) {
                pedido.confirmarEntrega();
                encontrado = true;
                break;
            }
        }
        
        if (encontrado == false) {
            System.out.println("Pedido não encontrado!");
        }
    }


    public static void verConfirmados() {
        System.out.println("pedidos confirmados:");
        for (Pedido pedido : pedidos) {
            if ("Confirmado".equals(pedido.getStatus())) {
                System.out.println(pedido.toString());
            }
        }
    }


    public static void verEntregues() {
        System.out.println("pedidos entregues:");
        for (Pedido pedido : pedidos) {
            if ("entregue".equals(pedido.getStatus())) {
                System.out.println(pedido.toString());
            }
        }
    }



}
