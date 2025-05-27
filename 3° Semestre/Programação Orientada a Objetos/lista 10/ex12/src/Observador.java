public class Observador {
    private String nome;
    public Observador(String nome){
        this.nome = nome;
    }

    public void processar(String texto){
        System.out.println(nome + " | " + texto.toUpperCase() + " | " + 2025 + " | "+ (nome.length() + texto.length() + 6));
    }
}