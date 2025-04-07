public class Main {
    public static void main(String[] args){
        Estoque estoque = new Estoque();
        Produto produto1 = new Produto(1, "Produto 1", 10.0, 5);
        Produto produto2 = new Produto(2, "Produto 2", 20.0, 10);
        Produto produto3 = new Produto(3, "Produto 3", 30.0, 8);

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);

        System.out.println("Lista de produtos:");
        System.out.println(estoque);

        Produto produtoBuscado = estoque.buscarProdutoPorNome("Produto 2");
        produtoBuscado.vender(2);
        produtoBuscado.repor(5);

        estoque.removerProdutoporID(2);
        System.out.println("Lista de produtos após remoção:");
        System.out.println(estoque);

    }        
}
