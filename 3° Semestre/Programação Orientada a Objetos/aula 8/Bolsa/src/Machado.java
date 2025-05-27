public class Machado{
    String nome;
    boolean afiado;

    public Machado(String nome, boolean afiado){
        this.nome = nome;
        this.afiado = afiado;
    }

    public void afiar(){
        if (afiado){
            System.out.println("O machado já está afiado");
        } 
        else{
            afiado = true;
            System.out.println("O machado foi afiado");
        }
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\nAfiado: " + afiado;
    }
}
