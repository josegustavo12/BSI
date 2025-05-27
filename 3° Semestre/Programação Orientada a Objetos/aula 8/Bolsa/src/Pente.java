public class Pente{
    String nome;
    boolean sujo;

    public Pente(String nome, boolean sujo){
        this.nome = nome;
        this.sujo = sujo;
    }

    public void limpar(){
        if (sujo != false){
            sujo = false;
            System.out.println("O pente foi limpo");
        } 
        else{
            System.out.println("O pente já está limpo");
        }
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\nsujo: " + sujo;
    }
}
