public class Produto implements Comparable<Produto>{ // tenho que implementar o comparable dentro de produto 
    String nome;
    int preco;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }



    public int getPreco() {
        return preco;
    }

    public int compareTo(Produto outro){
        if (preco > outro.getPreco()){
            return 1;
        }
        if (preco < outro.getPreco()){
            return -1;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString(){
        return "" + preco;
    }
}
