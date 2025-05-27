import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Vetors v1 = new Vetors(
        new double[] {1, 2, 3},
        new double[] {2, 5, 6}
        );
        double[] res = v1.Operacao(new Soma());
        System.out.println(Arrays.toString(res));
    }
}
