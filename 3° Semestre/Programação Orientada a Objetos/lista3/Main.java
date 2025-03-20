public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gustavo", 18, "Masculino");
        Pessoa p2 = new Pessoa("José", 20, "Masculino");

        p1.MostrarDetalhes();
        p2.MostrarDetalhes();

        p1.AumentarIdade(5);
        p1.MostrarDetalhes();

        Moradia moradia1 = new Moradia("Rua Luiz", p1, 3);
        Moradia moradia2 = new Moradia("Rua Alberto", p2, 3);

        moradia1.MostrarDetalhes();
        moradia2.MostrarDetalhes();

        Pessoa m1 = new Pessoa("Maria", 21, "Feminino");
        Pessoa m2 = new Pessoa("Ana", 25, "Feminino");
        Pessoa m3 = new Pessoa("Carlos", 30, "Masculino");
        Pessoa m4 = new Pessoa("Eduardo", 28, "Masculino");
        Pessoa m5 = new Pessoa("Fernanda", 22, "Feminino");

        moradia1.adicionarMorador(m1);
        moradia1.adicionarMorador(m2);
        moradia1.adicionarMorador(m3);
        moradia1.adicionarMorador(m4);
        moradia1.MostrarDetalhes();

        moradia2.adicionarMorador(m5);
        moradia2.MostrarDetalhes();

        Pessoa b1 = new Pessoa("Mario", 30, "Masculino");

        Casa casa1 = new Casa("Rua Luiz", b1, 5, "1491", 5, true);

        casa1.MostrarCasa();

        Pessoa ap1 = new Pessoa ("Roberta", 23, "Feminina");

        Apartamento apto1 = new Apartamento("Rua Fátima", ap1, 2, "130", 3, true);

        apto1.MostrarApartamento();

    }
}