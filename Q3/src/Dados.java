public class Dados {


    private int valor;

    public Dados(){

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }


    public int girarDado(){
        valor = (int) (Math.random() * 6) + 1; //forço ser inteiro e add mais um para n iniciar de 0
        return valor;
    }
}
