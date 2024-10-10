import Model.Baralho;
import Model.Carta;

public class GerenciarJogo {
    private Baralho baralho ;

    public static void main(String[] args) {
        GerenciarJogo gerenciar = new GerenciarJogo();
        gerenciar.baralho = new Baralho();
        System.out.println("Baralho Montado para o jogo");
        for (Carta carta:gerenciar.baralho.getBaralho()){
            System.out.println(carta);
        }
        System.out.println("Fim do baralho");
        System.out.println();

        //embaralhar
        System.out.println("Baralho embaralhado");
        gerenciar.baralho.embaralhar();
        for (Carta carta:gerenciar.baralho.getBaralho()){
            System.out.println(carta);
        }
        System.out.println("Fim do baralho");
    }
}
