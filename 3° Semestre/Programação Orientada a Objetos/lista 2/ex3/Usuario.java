
public class Usuario {
    String nome;
    int idade;
    String cpf;
    
    public Usuario(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void MostrarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }

    public String getNome(){
        return this.nome;
    }
}
