import java.util.Arrays;

public class Exemplo {
    public static void main(String[] args) {
        int[] vetor = {1,2,4,5,3,2,7} ;
        Arrays.sort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d] = %d\n", i, vetor[i]);
        }
    }
}
