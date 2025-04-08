public class hotel implements Reservavel {
    String nome;
    String responsavel;
    int quarto;
    
    public hotel(String nome, String responsavel, int quarto){
        this.nome = nome;
        this.responsavel = responsavel;
        this.quarto = quarto;
    }

    public void reservar(){
        System.out.println("Reserva para hotel feita, dados: \n" + toString());
    }

    @Override
    public String toString(){
        return "nome: " + nome + " | responsável: " + responsavel + " | quarto: " + quarto;
    }
}
