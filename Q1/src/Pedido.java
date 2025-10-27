import java.time.LocalDateTime;
import java.util.Scanner;

public class Pedido {
    private LocalDateTime dataHora;
    private String endereco;
    private Integer quantidade = 0;
    private Float total = 0f;
    private static final Float PRECO = 120f;
    private String cartao;
    private String status = "em processamento";
    private static Integer contador = 1; //para sequencia de codigos, por isso estático
    private Integer codigo;


    public Pedido(){
        this.codigo = contador++;

    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public Integer getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public static Float getPreco() {
        return PRECO;
    } // não tem como settar um valor constante

    public Integer getCodigo() {
        return codigo;
    } //nãp precisa de setter já que vai ser gerado automaticamente

    public String getCartao() {
        return cartao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getStatus() {
        return status;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Override
    public String toString(){
        return "codigo: " + codigo + "\ndata e hora prevista: " + dataHora + "\nquantidade: " + quantidade + "\nendereço: " + endereco + "\ntotal: " + total + "\nstatus: " + status; 
    }

    
    public void fazerPedido(){
        Scanner cin = new Scanner(System.in);
        
        try{
            dataHora = LocalDateTime.now(); //
            String confirmacao;

            Boolean flag = false;

            do {
                if(flag == false){
                System.out.println("botijões: ");
                quantidade = cin.nextInt(); 
                cin.nextLine();
                flag = true;
                }

                System.out.println("endereço: ");
                endereco = cin.nextLine();

                total = PRECO * quantidade;//fazendo as contas
                dataHora= dataHora.plusHours(2);//add mais duas horas
                
                System.out.println("----------------------");
                System.out.println(this.toString());
                System.out.println("----------------------");

                System.out.println("quer confirmar? (sim/não): ");
                confirmacao = cin.nextLine();

                
            } while (!confirmacao.equalsIgnoreCase("sim")); //vê se é diferente de "sim" e ignora maiusculo e minusculo

          
            System.out.println("----------------------");
            System.out.println(this.toString());
            System.out.println("----------------------");

            pedirCartao(cin); // passando o scanner pois estava dando excepcion

            status = "Confirmado";
            System.out.println("----------------------");
            System.out.println(this.toString() + "\ncartão: " + cartao);
            System.out.println("----------------------");

        }catch(Exception e){
            System.out.println("pedido não confirmado");
            System.out.println("erro: " + e.getMessage());
        }
    }

    private void pedirCartao(Scanner cin){
        System.out.println("cartão de credito: ");
        cartao = cin.nextLine();
    }

    public void confirmarEntrega(){
        if(status.equalsIgnoreCase("Confirmado")){
        status = "entregue";
        System.out.println(status);
        }else{
            System.out.println("PEDIDO NÃO LOCALIZADO");
        }

        
    }

    
}
