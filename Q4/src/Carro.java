public class Carro extends Veiculo{

    protected int portas;


    public Carro(){
        super(); //chama a classe mãe (veiculo) no formato padrão
        this.portas = 4;
    }

    public Carro(String marca, int ano, int portas){
        super(marca, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    //metodos

    public void changeGear(){ //trocar marcha
        System.out.println("trocou a marcha");
    }

    public void openDoor(){
        System.out.println("Todas as " + portas + " portas abertas");
    }

    public void openDoor(int numeroPorta) {
        System.out.println("Porta " + numeroPorta + " aberta");
    }

    //metodo obrigatorios

    @Override
    public void turnOn() { //metodo obrigatorio da classe abstrata

    }

    @Override
    public void displayInfo() { // puxando metodo de veiculo
        System.out.println("Carro - " + marca + " (" + ano + ") - " + portas + " portas");
    }


}
