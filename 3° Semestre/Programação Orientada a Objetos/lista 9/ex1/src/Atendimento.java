import java.util.ArrayDeque;
import java.util.Queue;

class Atendimento{
    Queue<String> fila = new ArrayDeque<>();

    public Atendimento(Queue<String> fila){
        this.fila = fila;
    }

    public void novoPaciente(String nome){
        fila.add(nome);
    }

    public String pacienteAtendido(){
        if (fila.isEmpty()){
            return "a fila está vazia";
        }
        else{
        return fila.poll();
        }
    }

    public void mostrarFila(){
        int count = 0;
        for (String i : fila){
            count++;
            System.out.println(count + "°" + "| " + i);
        }
    }

}