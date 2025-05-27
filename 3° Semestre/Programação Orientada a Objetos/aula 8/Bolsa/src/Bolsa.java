import java.util.List;
import java.util.ArrayList;


public class Bolsa <T>{
    private List<T> Objetos;

    public Bolsa(){
        this.Objetos = new ArrayList<>();
    }

    public T get(int index) {
        return Objetos.get(index);
    }

    public List<T> getObjetos() {
        return Objetos;
    }

    public void adicionar(T Objeto){
        Objetos.add(Objeto);
    }

    public void Mostrar(){
        for (T i : Objetos){
            System.out.println(i); // o i chama o toString e imprime bonitninho
        }
    }
}
