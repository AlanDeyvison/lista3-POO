class SedanEletrico extends Carro implements VeiculoEletrico {
    private int autonomia;

    public SedanEletrico() {
        super();
        this.autonomia = 0;
    }

    public SedanEletrico(String marca, int ano, int portas, int autonomia) {
        super(marca, ano, portas);
        this.autonomia = autonomia;
    }

    //getters and setters

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    //metodos

    public void checkAutonomy() {
        System.out.println("Autonomia restante: " + autonomia + "km");
    }

    // obrigatorios

    @Override
    public void chargeBatery() {
        System.out.println("Sedan elétrico carregando em tomada rápida");
    }

    @Override
    public void chargeBatery(int minutos) {
        int carga = minutos / 10;
        System.out.println("Carregado por " + minutos + " minutos - " + carga + "% de carga");
    }

    @Override
    public void turnOn() {
        System.out.println("Sedan elétrico " + marca + " ligado silenciosamente");
    }

    @Override
    public void changeGear() {
        System.out.println("Câmbio automático - sem necessidade de trocar marcha");
    }

    @Override
    public void displayInfo() {
        System.out.println("Sedan Elétrico - " + marca + " (" + ano + ") - " + portas + " portas - Autonomia: " + autonomia + "km");
    }

}
