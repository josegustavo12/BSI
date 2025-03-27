public class Predio  {

    Apartamento [] apartamentos;
    private int qtdApartamentos;
    private String endereco;
    private Pessoa proprietario;

    public Predio(String endereco, Pessoa proprietario, int qtdApartamentos){
        this.endereco = endereco;
        this.proprietario = proprietario;
        this.qtdApartamentos = qtdApartamentos;
        apartamentos = new Apartamento[qtdApartamentos];
    }

    public void AdicionarApartamento(Apartamento apartamento){
        for (int i = 0; i < apartamentos.length; i++){
            if (apartamentos[i] == null){
                apartamentos[i] = apartamento;
                break;
            }
        }
    }
    public void MostrarPredio(){
        System.out.println("******************** PREDIO ********************");
        System.out.println("Endereco: " + endereco);
        System.out.println("Proprietario: " + proprietario.getNome());
        System.out.println("Quantidade de Apartamentos: " + qtdApartamentos);
        System.out.println("******************** APARTAMENTOS ********************");
        for (int i = 0; i < apartamentos.length; i++){
            if (apartamentos[i] != null){
                apartamentos[i].MostrarApartamento();
            }
        }
    }
    
}
