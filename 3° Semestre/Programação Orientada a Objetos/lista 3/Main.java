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
        Pessoa ap2 = new Pessoa ("Roberto", 25, "Masculino");
        Pessoa ap3 = new Pessoa ("Roberval", 27, "Masculino");

        Apartamento apto1 = new Apartamento("Rua Fátima", ap1, 2, "13", 3, true);
        Apartamento apto2 = new Apartamento("Rua Fátima", ap2, 2, "14", 3, true);
        Apartamento apto3 = new Apartamento("Rua Fátima", ap3, 2, "15", 3, true);
        
        Pessoa ap12 = new Pessoa ("Carla", 25, "Feminina");
        Pessoa ap22 = new Pessoa ("Carlos", 27, "Masculino");
        Pessoa ap32 = new Pessoa ("Carla", 29, "Feminina");

        apto1.adicionarMorador(ap12);
        apto2.adicionarMorador(ap22);
        apto3.adicionarMorador(ap32);
        
        Predio predio = new Predio("Rua Fátima", m1, 3);

        predio.AdicionarApartamento(apto1);
        predio.AdicionarApartamento(apto2);
        predio.AdicionarApartamento(apto3);

        predio.MostrarPredio();

    }
}