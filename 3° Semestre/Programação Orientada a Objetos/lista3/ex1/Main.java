
public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gustavo", 18, "Masculino");
        Pessoa p2 = new Pessoa ("José", 20, "Masculino");

        p1.MostrarDetalhes();
        p2.MostrarDetalhes();

        p1.AumentarIdade(5);
        p1.MostrarDetalhes();
    }
}
