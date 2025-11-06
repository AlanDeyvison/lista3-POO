public class Robo{
    private int linha = 0; //posição
    private int coluna = 0; //posição
    private int passo = 1;
    

     Robo(){
    }

    public Robo(int passo) {
        this.passo = passo;
    }

    public int getLinha(){
        return linha;
    }

    public void setLinha(){
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getPasso() {
        return passo;
    }

    public void setPasso(int passo) {
        this.passo = passo;
    }


    //metodos


    public void mostrarPosicao(){
        System.out.printl("linha: " + linha "\ncoluna: " + coluna );

    }

    public void andarDireita(){
        int andarD = coluna + passo;
        if(andarD < 40){
            System.out.println(passo + " direita.");
            coluna = andarD;
        }else{
            linha = 39;
            System.out.println("não dá mais pra ir pra direita.");
        }

    }

    public void andarEsquerda(){
        int andarE = coluna - passo;
        coluna = andarE;
        if(andarE >= 0){
            System.out.println(passo + " para esquerda."); 
        } else{
            linha = 0;
            System.out.println("não dá mais pra ir pra esquerda.")
        }
    }
        

    public void andarFrente(){
        int andaF = linha - passo;
        if(andarF >= 0){
            System.out.println(passo + " para frente");
            linha = andaF;
        } else{
            linha = 0;
            System.out.println("não dá mais pra ir pra frente.")
        }

    }

    public void andarTras(){
        int andarT = linha + passo;
        if(andarE < 20){
            System.out.println(passo + " para trás.");
            linha = andarT;
        } else{
            linha = 19;
            System.out.println("não dá mais pra ir pra trás.");
        }
    }

    

}