public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", false);
        Livro l2 = new Livro("O Hobbit", "J.R.R. Tolkien", false);
        Livro l3 = new Livro("1984", "George Orwell", false);

        biblioteca.AdicionarLivro(l1);
        biblioteca.AdicionarLivro(l2);
        biblioteca.AdicionarLivro(l3);

        Usuario u1 = new Usuario("Alice", 1);
        Usuario u2 = new Usuario("Bob", 2);

        u1.emprestarLivro(biblioteca, "O Hobbit");
        u2.emprestarLivro(biblioteca, "1984");
        u1.emprestarLivro(biblioteca, "1984"); // tentativa de pegar já emprestado

        u1.listarLivrosEmprestados();
        u2.listarLivrosEmprestados();

        u1.devolverLivro(biblioteca, "O Hobbit");
        u1.listarLivrosEmprestados();

        u2.emprestarLivro(biblioteca, "O Hobbit"); // agora deve estar disponível
    }
}
