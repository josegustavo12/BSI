public class App {
    public static void main(String[] args) throws Exception {
        Agencia g1 = new Agencia("G1");

        Observador jose = new Email("josegustavovictor@gmail.com");
        Observador bruna = new Site("Google");

        g1.addParticipante(jose);
        g1.addParticipante(bruna);

        g1.notificar("Brasil ganhou o hexa!!");
    }
}
