import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.System.*;

public class Exemplo1 {
    public static void main(String[] args) {
        double raio = 10.0;
        double volume = (4.0/3)* PI * pow(raio, 3.0);
        out.println(volume);
    }
}
