public class DriversImpressora extends Drivers {
    public int resolucao;
    public int velocidade;
    
    public DriversImpressora(String nome, String categoria, boolean status, int resolucao, int velocidade){
        super(nome, categoria, status);
        this.resolucao = resolucao;
        this.velocidade = velocidade;
    }
    
    public void MostrarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Status: " + this.status);
        System.out.println("Resolução: " + this.resolucao);
        System.out.println("Velocidade: " + this.velocidade);
    }
}