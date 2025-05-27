public class App {
    public static void main(String[] args) throws Exception {
        Time[] tabela = {
            new Time("Palmeiras", 78),
            new Time("Flamengo", 66),
            new Time("Corinthians", 64),
            new Time("Grêmio", 55),
            new Time("Atlético-MG", 60),
            new Time("Cruzeiro", 40),
            new Time("Botafogo", 62),
            new Time("Internacional", 50),
            new Time("São Paulo", 59),
            new Time("Vasco", 38)
        };

        System.out.println("******* Tabela não-ordenada *******");
        for (Time i : tabela){
            System.out.println(i);
        }

        Ordenar ordenar = new Ordenar(); // caso não queira usar o static dentro da metodo 
        ordenar.InsertionSort(tabela);

        // Ordenar.InsertionSort(tabela) -> com o static dentro do metodo
        System.out.println("******* Tabela ordenada *******");
        
        for (Time i : tabela){
            System.out.println(i);
        }
    }
}
