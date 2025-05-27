import java.util.*;
public class Interseccao implements Operacao{
    public Interseccao(){}

    public void Calcular(int[] n1, int[] n2){
        List<Integer> resultado = new ArrayList<>();

        for(int i : n1){
            for (int j : n2){
                if (i == j){
                    if (!resultado.contains(i)){
                        resultado.add(i);
                    }
                }
            }
        }
        System.out.println("Conjunto 1: " + Arrays.toString(n1));
        System.out.println("Conjunto 2: " + Arrays.toString(n2));
        System.out.println("Intersecção dos vetores: " + resultado);
    }

}
