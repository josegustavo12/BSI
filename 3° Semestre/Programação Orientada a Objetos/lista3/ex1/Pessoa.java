public class Pessoa {
    String nome;
    int idade;
    String sexo;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void MostrarDetalhes(){
        System.out.println("----------------------------------------");
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);
        System.out.println("----------------------------------------");

    }
    public void AumentarIdade(int idade_nova){
        System.out.println("Idade Atual: " + idade + "\nIdade após aumento: " + (idade_nova + idade));
        idade += idade_nova;
    }

}
