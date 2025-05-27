import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int[] c1 = {1,2,3};
        int[] c2 = {2,4,6};

        System.out.println("Digite a opção: ");
        String op = scanner.nextLine();
        scanner.close();

        MeusVetores m = new MeusVetores(c1, c2, OperacaoFactory.criar(op));
        m.executar();
    }
}
