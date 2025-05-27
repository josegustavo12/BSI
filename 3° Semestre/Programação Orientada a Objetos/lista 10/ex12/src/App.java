public class App {
    public static void main(String[] args) throws Exception {
        Observador o1 = new Observador("Jose");
        Observador o2 = new Observador("Carlos");

        Observado o3 = new Observado();

        o3.acrescentar(o1);
        o3.acrescentar(o2);

        o3.notificar("Teste bizarro");
    }
}
