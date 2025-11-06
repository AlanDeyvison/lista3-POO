public class SUV extends Carro {
    private boolean tracao4x4;

    public SUV() {
        super();
        this.tracao4x4 = true;
    }

    public SUV(String marca, int ano, int portas, boolean tracao4x4) {
        super(marca, ano, portas);
        this.tracao4x4 = tracao4x4;
    }

    //getters and setters


    public boolean isTracao4x4() {
        return tracao4x4;
    }

    public void setTracao4x4(boolean tracao4x4) {
        this.tracao4x4 = tracao4x4;
    }

    // Métodos


    public void activateTraction() {
        if (tracao4x4) {
            System.out.println("Tração 4x4 ativada");
        } else {
            System.out.println("Veículo não possui tração 4x4");
        }
    }

    // metodos obrigatorios


    @Override
    public void turnOn() {
        System.out.println("SUV " + marca + " ligado com botão start");
    }

    @Override
    public void displayInfo() {
        System.out.println("SUV - " + marca + " (" + ano + ") - " + portas + " portas - 4x4: " + tracao4x4);
    }


}