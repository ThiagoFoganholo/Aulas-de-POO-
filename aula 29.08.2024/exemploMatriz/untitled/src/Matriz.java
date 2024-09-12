import java.util.Scanner;


public class Matriz {
    private static final int DIML = 3;
    private static final int DIMC = 2;
    public  void main(String[] args) {
        //Entrada exemplo
        Scanner teclado = new Scanner(System.in);
        String[][] casais = new String[3][2];
        for (int i = 0; i < DIML; i++) {
            for (int j = 0; j < DIMC; j++) {
                System.out.println("Digite o nome " + j+1 + " :");
                casais[i][j] = teclado.nextLine();
            }
        }
        //Imprimir o dado dos casais
        for (int i = 0; i < DIML; i++) {
            for (int j = 0; j < DIMC; j++) {
                System.out.print("dados do casal " + j+1 + " : "+casais[i][j] + ",");
            }
            System.out.println();
        }
    }
}
