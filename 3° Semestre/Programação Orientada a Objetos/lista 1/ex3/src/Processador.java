public class Processador {
    String nome;
    double Potencia;
    int ano;

    // construtor da classe
    public Processador(String nome, double potencia, int ano){
        this.nome = nome;
        this.Potencia = potencia;
        this.ano = ano;
    }

    private void OtimizarPerformance(){
        System.out.println("Otimizando performance!");
    }

    public void IniciarProcessador(){
        System.out.println("Processaodor" + nome + "Iniciado!!!");
        OtimizarPerformance();
    }

    public void MostrarProcessador(){
        System.out.println("--------------------------------");
        System.out.println("Processador: " + nome);
        System.out.println("Potencia: " + Potencia);
        System.out.println("Ano de fabricação do processador: " + ano);
    }
}
