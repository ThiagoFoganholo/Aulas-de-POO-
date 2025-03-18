package Operacoes;

public class Dividir {
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return num1 / num2;
    }
}
