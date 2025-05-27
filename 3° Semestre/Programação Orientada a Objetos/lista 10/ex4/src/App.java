public class App {
    public static void main(String[] args) {
        double n1 = 2;
        double n2 = 3;
        String op = "-";
        String expressao = "8 / 2";
        CalculadoraFacade c = new CalculadoraFacade();
        System.out.println("Res 1: " + c.Calcular(op, n1, n2));
        System.out.println("Res 2: " + c.CalcularCompleto(expressao));
    }
}
