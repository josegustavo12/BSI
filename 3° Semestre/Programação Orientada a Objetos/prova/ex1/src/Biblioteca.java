
class Biblioteca {
    Livro livros[];
    private int MaxLivros;
    private int indice;

    // add livro, emprestar livro, devolver livro, listar livro, construtor

    public Biblioteca (int MaxLivros){
        this.livros = new Livro[MaxLivros + 1]; // cria a lista de livros com o maximo de livros suportados pela biblioteca
        this.MaxLivros = MaxLivros;
        this.indice = 0;
    }
    public void AdicionarLivro(Livro l) {
        if (indice < MaxLivros) {
            livros[indice] = l;
            System.out.println("Adicionando " + l + " à biblioteca");
            indice++;
        } else {
            System.out.println("Quantidade máxima de livros atingida");
        }
    }
    

    public boolean Emprestar (String nome){

        for (Livro i : livros){

            if (i != null && i.autor.equals(nome) && !i.getEmprestado()){
                i.setEmprestado(true);
                return true;
            }

        }
        return false;
    }

    public void Devolver (Livro l){
        l.Devolver();
        System.out.println("Livro " + l + " devolvido");
    }

    
    @Override
    public String toString(){
        String string = "";
        for (Livro i : livros){
            string += i.toString();
        }
        return string;
    }

}