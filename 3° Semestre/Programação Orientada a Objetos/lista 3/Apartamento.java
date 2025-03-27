public class Apartamento extends Moradia{
    private String numero;
    private int comodos;
    private boolean varanda;

    public Apartamento (String endereco, Pessoa proprietario, int capacidade, String numero, int comodos, boolean varanda){
        super(endereco, proprietario, capacidade);
        this.numero = numero;
        this.comodos = comodos;
        this.varanda = varanda;
    }

    public void MostrarApartamento(){
        System.out.println("\n\nAPARTAMENTO");
        MostrarDetalhes();
        if (varanda == true){
            System.out.println("Numero: " + numero + "\nComodos: " + comodos + "\nVaranda: Sim");
        }
        else {
        System.out.println("Numero: " + numero + "\nComodos: " + comodos + "\nVaranda: Não");
        }
    }
}