public class Casa extends Moradia {
    private String numero;
    private int comodos;
    private boolean areaExterna;

    public Casa(String endereco, Pessoa proprietario, int capacidade, String numero, int comodos, boolean areaExterna) {
        super(endereco, proprietario, capacidade);
        this.numero = numero;
        this.comodos = comodos;
        this.areaExterna = areaExterna;
    }

    public void MostrarCasa() {
        System.out.println("CASA");
        super.MostrarDetalhes();// reutiliza para as infos que vieram do Moradia
        System.out.println("Cômodos: " + this.comodos);
        System.out.println("Possui área externa: " + (this.areaExterna ? "Sim" : "Não"));
        System.out.println("--------------------------------------------------");

    }
}
