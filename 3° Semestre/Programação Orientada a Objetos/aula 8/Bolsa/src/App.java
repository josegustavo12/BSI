public class App {
    public static void main(String[] args) {
        Machado m1 = new Machado("Tramontina 2", false);
        Machado m2 = new Machado("Generico", true);

        Pente p1 = new Pente("rosa", false);
        Pente p2 = new Pente("azul", true);

        Bolsa<Object> b1 = new Bolsa<>();
        b1.adicionar(m1);
        b1.adicionar(m2);
        b1.adicionar(p1);
        b1.adicionar(p2);
        b1.adicionar(new Machado("Tramontina 8", true)); // outra forma de adicionar dentro da bolsa

        System.out.println("*******Lista 1*******");
        b1.Mostrar();

        ((Machado) b1.get(0)).afiar(); // forma para manipular um item dentro da lista do array
        System.out.println("*******Lista 2*******");
        b1.Mostrar();

    }
}
