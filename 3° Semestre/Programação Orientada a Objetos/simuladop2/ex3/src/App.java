public class App {
    public static void main(String[] args) {

    Integer[] array = new Integer[5];
    pilha<Integer> p = new pilha<>(array);
    Integer tmp;
    p.push(4);
    p.push(5);
    p.push(7);
    p.imprimir();


    tmp = p.pop();
    p.imprimir();


    String[] lista = new String[5];
    pilha<String> p2 = new pilha<>(lista);
    p2.push("José");
    p2.push("Larissa");
    p2.push("Diego");
    p2.imprimir();

    p2.pop();
    p2.imprimir();
    }
}
