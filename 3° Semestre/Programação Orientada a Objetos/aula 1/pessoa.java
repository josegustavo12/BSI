// Estudo sobre class

public class pessoa {

    // atributos (propriedades)
    String nome;
    int idade;

    // método construtor
    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    } 
    
    // método

    public void apresentar(){
        System.out.println("Olá, eu sou " + nome + " e tenho " + idade + " anos.");
    }

    
}
