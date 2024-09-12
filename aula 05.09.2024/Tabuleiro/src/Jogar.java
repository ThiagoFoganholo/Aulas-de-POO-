import model.Tabuleiro;

import java.util.Scanner;

public class Jogar {
    public static void main(String[] args) {
        int [] valores = new int[5];
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro palpite:");
        valores[0] = scanner.nextInt();
        System.out.println("Digite o segundo palpite:");
        valores[1] = scanner.nextInt();
        double premio = tabuleiro.jogar(valores);

        if(premio > 0){
            System.out.println("GANHOU!!!");
        }else{
            System.out.println("PERDEU!!!");
        }
    }
}
