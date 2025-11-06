public abstract class Veiculo {

    protected String marca;
    protected int ano;



    public Veiculo(){//padronificando quando não passar parametro
    this.marca = "desconhecida";
    this.ano = 0;
    }

    public Veiculo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract void turnOn();//ligar

    public void displayInfo(){//mostrar info quando sem parametro
        System.out.println("marca: " + marca + ", ano: " + ano);
    }

    //para overload

    public void displayInfo(boolean detalhes){
        if(detalhes){
            System.out.println("veiculo detalhado");
            System.out.println("marca: " + marca);
            System.out.println("ano: " + ano);
        }else{
            displayInfo();
        }
    }


}
