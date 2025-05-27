import java.util.*;
public class Uniao implements Operacao{
    public Uniao(){}

    public void Calcular(int[] n1, int[] n2){
        List<Integer> resultado = new ArrayList<>();

        for (int i : n1) {
            if (!resultado.contains(i)) {
                resultado.add(i);
            }
        }

        for (int j : n2) {
            if (!resultado.contains(j)) {
                resultado.add(j);
            }
        }
        System.out.println("Conjunto 1: " + Arrays.toString(n1));
        System.out.println("Conjunto 2: " + Arrays.toString(n2));
        System.out.println("União dos vetores: " + resultado);
    }

}
