public class main {
    public static void Main(String[] args) {
        Produto p1 = new Produto("Arroz", 5.50, 10);
        p1.exibirprodutos();
        p1.adicionarprodutos(5);
        p1.exibirprodutos();
        p1.removerprodutos(3);
        p1.exibirprodutos();
    }
}
