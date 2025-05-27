public class Main {
    public static void main(String[] args) {
        ModUsuario usuario = new ModUsuario("José");
        ModPagamento pagamento = new ModPagamento("José", 15);

        usuario.Login();
        pagamento.Pagar();

        Logger l1 = Logger.getInstancia(); // declara uma instancia do logger
        Logger l2 = Logger.getInstancia(); // aqui declara a mesma instancia

        if (l1 == l2) {
            System.out.println("Todas as instâncias de Logger são iguais (Singleton confirmado).");
        } else {
            System.out.println("Instâncias diferentes encontradas (Singleton falhou).");
        }
    }
}
