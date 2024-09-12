package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<Carta>();

    //Construtor - criar o baralho
    public Baralho() {
        MontarBaralho();
    }

    private void MontarBaralho() {
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor: Valor.values()){
                Carta carta = new Carta(naipe, valor);
                cartas.add(carta);
            }
        }
    }
    public List<Carta> getBaralho() {
        return cartas;
    }
    public void embaralhar(){
        Collections.shuffle(cartas);
    }
}
