import java.util.ArrayDeque;
import java.util.Queue;

public class App {
    public static void main(String[] args){
        Queue<String> fila = new ArrayDeque<>();
        
        Atendimento a1 = new Atendimento(fila);

    a1.novoPaciente("José");
    a1.novoPaciente("Carlos");
    a1.novoPaciente("Gabriel");
    a1.novoPaciente("Pedro");
    a1.mostrarFila();

    System.out.println("****** 2 Pacientes atendidos ******");
    System.out.println(a1.pacienteAtendido());
    System.out.println(a1.pacienteAtendido());

    System.out.println("****** Fila atual *******");
    a1.mostrarFila();
    }
}
