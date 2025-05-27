import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo implements Runnable {
    
    private String nome;
    private int total = 0;

    public LeitorArquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(nome))) {
            while (br.readLine() != null) {
                total++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler " + nome + ": " + e.getMessage());
        }
    }

    public int getTotal() {
        return total;
    }
}
