public class Tela {
    String nome;
    int tamanho;
    String resolucao;
    boolean touch;

    public Tela(String nome, int tamanho, String resolucao, boolean touch) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.touch = touch;
    }

    public void LigarTela() {
        System.out.println("Tela" + nome + "Ligada");
        ligarTouch();
    }

    private void ligarTouch() {
        if (touch = false) {
            System.out.println("Não possui touch");
        } else {
            System.out.println("Touch ligado");
        }
    }
    public void MostrarTela(){
        System.out.println("--------------------------------");
        System.out.println("Tela: " + nome);
        System.out.println("Tamanho(polegadas)" + tamanho);
        System.out.println("Resolução: " + resolucao);
    }
}
