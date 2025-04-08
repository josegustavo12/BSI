class Usuario {
    private String nome;
    private int id;
    private Livro[] livrosEmprestados;
    private int qtdLivrosEmprestados;
    private final int MAX_LIVROS = 5;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new Livro[MAX_LIVROS];
        this.qtdLivrosEmprestados = 0;
    }

    public void emprestarLivro(Biblioteca biblioteca, String titulo) {
        if (qtdLivrosEmprestados >= MAX_LIVROS) {
            System.out.println(nome + " atingiu o limite de livros emprestados.");
            return;
        }

        for (int i = 0; i < biblioteca.livros.length; i++) {
            Livro l = biblioteca.livros[i];
            if (l != null && l.titulo.equals(titulo) && !l.getEmprestado()) {
                l.setEmprestado(true);
                livrosEmprestados[qtdLivrosEmprestados] = l;
                qtdLivrosEmprestados++;
                System.out.println(nome + " emprestou o livro: " + l.titulo);
                return;
            }
        }

        System.out.println("Livro '" + titulo + "' não está disponível.");
    }

    public void devolverLivro(Biblioteca biblioteca, String titulo) {
        for (int i = 0; i < qtdLivrosEmprestados; i++) {
            if (livrosEmprestados[i].titulo.equals(titulo)) {
                livrosEmprestados[i].Devolver();
                System.out.println(nome + " devolveu o livro: " + livrosEmprestados[i].titulo);

                // Remover da lista (deslocar para esquerda)
                for (int j = i; j < qtdLivrosEmprestados - 1; j++) {
                    livrosEmprestados[j] = livrosEmprestados[j + 1];
                }
                livrosEmprestados[qtdLivrosEmprestados - 1] = null;
                qtdLivrosEmprestados--;
                return;
            }
        }

        System.out.println("O usuário " + nome + " não possui esse livro.");
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados por " + nome + ":");
        if (qtdLivrosEmprestados == 0) {
            System.out.println("Nenhum livro emprestado.");
        }
        for (int i = 0; i < qtdLivrosEmprestados; i++) {
            System.out.println("- " + livrosEmprestados[i].titulo);
        }
    }
}
