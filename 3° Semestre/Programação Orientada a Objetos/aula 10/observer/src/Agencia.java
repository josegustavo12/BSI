import java.util.*;
public class Agencia implements Observado {
    List<Observador> assinantes = new ArrayList<>();
    String nome;

    public Agencia(String nome){this.nome = nome;}; // construtor

    public void addParticipante(Observador O){
        assinantes.add(O);
    }
    public void removeParticipante(Observador O){
        assinantes.remove(O);
    }
    public void notificar(String noticia){
        System.out.println("Agência " + nome + " Publica para seus assinantes:" );
        for (Observador i : assinantes){
            i.update(noticia);
        }
    }

}
