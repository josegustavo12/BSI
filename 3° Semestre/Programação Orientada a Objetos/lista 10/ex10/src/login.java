public class login{
    String nome;
    String id;

    public login(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }
    
    public void mudarID(String idnew){ // metodo vulneravel 
        this.id = idnew;
        System.out.println("Novo ID: " + idnew);
    }

}