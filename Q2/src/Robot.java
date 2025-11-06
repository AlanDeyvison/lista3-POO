public class Robot {
    private int linha = 0;
    private int coluna = 0;
    private int passo = 1;

    public Robot() {
    }

    public Robot(int passo) {
        this.passo = passo;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
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

    public void mostrarPosicao() {
        System.out.println("linha: " + linha + " coluna: " + coluna);
    }

    public void andarDireita() {
        int andarD = coluna + passo;
        if (andarD < 40) {
            System.out.println(passo + " direita.");
            coluna = andarD;
        } else {
            coluna = 39;
            System.out.println("não dá mais pra ir pra direita.");
        }
    }

    public void andarEsquerda() {
        int andarE = coluna - passo;
        if (andarE >= 0) {
            System.out.println(passo + " para esquerda.");
            coluna = andarE;
        } else {
            coluna = 0;
            System.out.println("não dá mais pra ir pra esquerda.");
        }
    }

    public void andarFrente() {
        int andarF = linha - passo;
        if (andarF >= 0) {
            System.out.println(passo + " para frente");
            linha = andarF;
        } else {
            linha = 0;
            System.out.println("não dá mais pra ir pra frente.");
        }
    }

    public void andarTras() {
        int andarT = linha + passo;
        if (andarT < 20) {
            System.out.println(passo + " para trás.");
            linha = andarT;
        } else {
            linha = 19;
            System.out.println("não dá mais pra ir pra trás.");
        }
    }
}