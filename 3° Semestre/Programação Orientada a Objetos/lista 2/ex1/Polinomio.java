public class Polinomio {

    private Termo termos[]; 
    private int grau_max;

    // Controla quantos termos já foram adicionados
    private int quantidadeTermos;

    public Polinomio(int grau_max){
        this.grau_max = grau_max;
        this.termos = new Termo[grau_max + 1]; // Grau máximo + 1 posições (inclui grau 0)
        // consequentemente é o tamanho máximo da lista de termos
        this.quantidadeTermos = 0;
    }

    public void Add(Termo termo){
        // verifica se obedece o grau máximo permitido
        if (termo.grau > grau_max){
            System.out.println("Grau maior que o permitido");
            return; // interrompe a execução
        }

        // verifica se o termo já existe
        for (int i = 0; i < quantidadeTermos; i++){
            if (termos[i].grau == termo.grau){
                termos[i].coeficiente += termo.coeficiente;
                return; // se o grau já existe, soma os coeficientes
            }
        }

        // adiciona termo novo se houver espaço
        if (quantidadeTermos < termos.length){ // quantidade de termos -> ultimo indice 
            termos[quantidadeTermos] = termo;
            quantidadeTermos++;
        } else {
            System.out.println("Não há espaço para mais termos no polinômio");
        }
    }

    public void MostrarPolinomio(){
        for (int i = 0; i < quantidadeTermos; i++){
            System.out.print(termos[i].coeficiente + "x^" + termos[i].grau + " ");
        }
        System.out.println(); // quebra linha ao fim
    }

    public double CalcularPolinomio(double x){
        double resultado = 0;

        // percorre todos os termos existentes
        for (int i = 0; i < quantidadeTermos; i++){
            resultado += termos[i].coeficiente * Math.pow(x, termos[i].grau);
            // resultado += coeficiente * x^grau
        }

        return resultado;
    }
}