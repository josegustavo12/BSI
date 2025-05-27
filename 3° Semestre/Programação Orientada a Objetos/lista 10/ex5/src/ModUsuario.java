public class ModUsuario {
    String nome;
    public ModUsuario(String nome){
        this.nome = nome;
    }

    public void Login(){
        Logger.getInstancia().Registrar("Usuario: " + nome + " registrado");    
    }
}
