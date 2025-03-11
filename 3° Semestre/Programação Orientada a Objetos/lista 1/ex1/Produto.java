public class Produto{

    String nome;
    double preco;
    int quantidade;

    public
     Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int adicionarprodutos(int quantidade){
        return this.quantidade += quantidade;
    }
    public int removerprodutos(int quantidade){
        return this.quantidade -= quantidade;
    }

    

    public void exibirprodutos(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}