
public class Caminhao extends Veiculo implements VeiculoAutonomo, VeiculoEletrico{

    private double capacidadeDeCarga;

    public Caminhao(){
        super();
        this.capacidadeDeCarga = 0.0;
    }

    public Caminhao(String marca, int ano, double capacidadeDeCarga){
        super(marca, ano);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    //getters and setters

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }



    //metodos

    public void carryThing(){//carregar coisas
        System.out.println("caminhao carregando as mercadorias");

    }


   //metodos obrigatorios
    @Override
    public void turnOn() {
        System.out.println("ligando caminhão " + marca);

    }

    @Override
    public void autoPilot() {
        System.out.println("piloto automatico da(o)" + marca + " ativado");

    }

    @Override
    public void calibrateSensor() {
        System.out.println("sensor do caminhão calibrado");
    }

    @Override
    public void chargeBatery() {
        System.out.println("carregando caminhão");

    }

    @Override
    public void chargeBatery(int min) {
        System.out.println("bateria carregará em " + min + " minutos");

    }
}
