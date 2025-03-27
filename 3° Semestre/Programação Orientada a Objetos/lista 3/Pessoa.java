public class Pessoa {
    public String nome;
    private int idade;
    private String sexo;

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

    public void setIdade(int idade){
        if (idade > 0){
            System.out.println("Idade setada: " + idade);
        }
        this.idade = idade;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getSexo(){
        return sexo;
    }

}
