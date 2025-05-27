public class App {
    public static void main(String[] args){
        
        // teste generico da classe generica "rs"
        Gen<Integer> g1 = new Gen<>(5, 3);
        System.out.println(g1);
        Gen<Integer> g2 = new Gen<>(2, 10);
        System.out.println((g2));


        // B)  
        Produto p1 = new Produto("Arroz", 5);
        Produto p2 = new Produto("Carne", 30);

        Gen<Produto> g3 = new Gen<>(p1, p2);
        System.out.println(g3);
    }
}
