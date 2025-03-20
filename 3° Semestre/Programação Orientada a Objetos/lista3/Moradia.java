public class Moradia {
    private String endereco;
    private Pessoa[] moradores;
    private Pessoa proprietario;
    private int quantidadeMoradores;

    public Moradia(String endereco, Pessoa proprietario, int capacidade) {
        this.endereco = endereco;
        this.proprietario = proprietario;
        this.moradores = new Pessoa[capacidade]; // Definir o tamanho do array
        this.quantidadeMoradores = 0;
    }

    public void adicionarMorador(Pessoa morador) {
        if (quantidadeMoradores < moradores.length) {
            moradores[quantidadeMoradores] = morador;
            quantidadeMoradores++;
        } else {
            System.out.println("Não há mais espaço para moradores.");
        }
    }

    public String getEndereco(){
        return endereco;
    }

    public void MostrarDetalhes() {
        System.out.println("--------------------------------------------------");
        System.out.println("Endereço: " + endereco);
        System.out.println("Proprietário: " + proprietario.getNome());

        System.out.println("Moradores:");
        for (int i = 0; i < quantidadeMoradores; i++) {
            System.out.println(i+1 + "° " + moradores[i].getNome() + " - " + moradores[i].getIdade() + " anos" + " - " + "Sexo: " + moradores[i].getSexo());
        }
        System.out.println("--------------------------------------------------");

    }
}
