import java.util.*;
public class Observado {
    List<Observador> o = new ArrayList<>();

    public Observado(){}

    public void acrescentar(Observador i){
        o.add(i);
    }

    public void notificar(String texto){
        for (Observador i : o){
            i.processar(texto);
        }
    }
}
