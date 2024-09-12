import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        //Manipular leitura de I/O
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int x = Integer.parseInt(entrada.nextLine());
        int soma = x+10;
        System.out.println("novo valor: " + soma);
        int res = somar(1,2);
    }

    /**
     *
     * @param a asdasd
     * @param b adasda
     * @return dasda
     */
    static int somar(int a, int b) {
        return a+b;
    }
}
