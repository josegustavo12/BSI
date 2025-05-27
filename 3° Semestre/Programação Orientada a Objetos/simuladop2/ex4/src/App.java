public class App {
    public static void main(String[] args) throws Exception {
        LeitorArquivo leitor1 = new LeitorArquivo("src/a.txt");
        LeitorArquivo leitor2 = new LeitorArquivo("src/b.txt");
        Thread t1 = new Thread(leitor1);
        Thread t2 = new Thread(leitor2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();


        System.out.println("Linhas totais: " + (leitor1.getTotal() + leitor2.getTotal()));
    }
}
