class Produto{
    int id;
    String nome;
    double preco;
    int quantidade;

    public Produto(int id, String nome, double preco, int quantidade){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void vender(int qtdv){
        System.out.println("Vendendo " + qtdv + " unidades de " + nome);
    }

    public void repor (int qtdr){
        System.out.println("Repondo " + qtdr + " unidades de " + nome);
    }

    @Override
    public String toString(){
        return "Produto: " + nome + "\n" +
               "ID: " + id + "\n" +
               "Preço: " + preco + "\n" +
               "Quantidade: " + quantidade;
    }
}

