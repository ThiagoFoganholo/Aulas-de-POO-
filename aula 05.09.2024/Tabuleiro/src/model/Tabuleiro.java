package model;

import java.util.Random;

public class Tabuleiro {
    private int[][] matriz = new int[10][10];
    private int[] palpites = new int[2];
    int cont=0;

    public Tabuleiro(){
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }
    }
    public double jogar(int[]palpites){
        this.palpites = palpites;
        return verificar();
    }

    private double verificar() {
        //fazer a logica para procurar os palpites no tabuleiros
        for (int p = 0; p < 2; p++){//varrer os palpites
            for (int l = 0; l < 2; l++){
                for (int c = 0; c < 2; c++){
                    if ( palpites[c] == matriz[p][l]){
                        cont++;
                    }
                }
            }
        }
        exibirTabuleiro();
        return (cont > 2 ? cont * 1000.0 : 0.0);
    }

    private void exibirTabuleiro() {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (matriz[i][j] == palpites[0] || matriz[i][j] == palpites[1]){
                    System.out.printf("[%3d]* ",matriz[i][j]);
                }else {
                    System.out.printf("[%3d] ",matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
