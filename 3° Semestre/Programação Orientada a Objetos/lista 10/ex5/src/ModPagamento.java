public class ModPagamento {
    String nome;
    double pag;
    public ModPagamento(String nome, double pag){
        this.nome = nome;
        this.pag = pag;
    }

    public void Pagar(){
        Logger.getInstancia().Registrar("Usuario: " + nome + " pagou " + pag + "R$");
    }
}
