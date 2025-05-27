import java.util.*;

public class Diferenca implements Operacao {
    public Diferenca() {}

    @Override
    public void Calcular(int[] n1, int[] n2) {
        List<Integer> resultado = new ArrayList<>();

        for (int i : n1) {
            boolean encontrado = false;
            for (int j : n2) {
                if (i == j) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado && !resultado.contains(i)) {
                resultado.add(i);
            }
        }

        System.out.println("Conjunto 1: " + Arrays.toString(n1));
        System.out.println("Conjunto 2: " + Arrays.toString(n2));
        System.out.println("Diferença (C1 - C2): " + resultado);
    }
}
