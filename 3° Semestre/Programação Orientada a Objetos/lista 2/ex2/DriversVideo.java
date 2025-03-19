
public class DriversVideo extends Drivers{
    public int brilho;
    public int contraste;
    private int resolucao;

    public DriversVideo(String nome, String categoria, boolean status, int brilho, int contraste, int resolucao){
        super(nome, categoria, status);
        this.brilho = brilho;
        this.contraste = contraste;
        this.resolucao = resolucao;
    }

    public void AjustarBrilho(int brilho){
        System.out.println("Brilho ajustado para " + brilho);
        this.brilho = brilho;
    }
    public void AjustarContraste(int contraste){
        System.out.println("Contraste ajustado para " + contraste);
        this.contraste = contraste;
    }

    public void MostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Status: " + status);
        System.out.println("Brilho: " + brilho);
        System.out.println("Contraste: " + contraste);
        System.out.println("Resolução: " + resolucao);
    }
}
