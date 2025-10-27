package com.teste;
public class Mapa {
    private char[][] tamanhoSala;

    public Mapa(){
        tamanhoSala = new char[20][40]; 
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 40; j++){
                tamanhoSala[i][j] = ' ';
            }
        }
    }


    public char[][] getTamanhoSala() {
        return tamanhoSala;
    }
    
    public void setTamanhoSala(char[][] tamanhoSala){
        this.tamanhoSala = tamanhoSala;
    }


    public void mapear(Robo robo){
        //limpar mapa
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 40; j++){
                tamanhoSala[i][j] = ' ';
            }
        }

        //add na posicao
        int linha = robo.getLinha();
        int coluna = robo.getColuna();
        if((linha >= 0 && linha < 20) && (coluna >= 0 && coluna < 40 )){
            tamanhoSala[linha][coluna] = '1';
        }

        //mostrar
        System.out.println("--------------------");//acho que 20 carach fica bom
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 40; j++){
                System.out.print(tamanhoSala[i][j]);//sem pular linha
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
}