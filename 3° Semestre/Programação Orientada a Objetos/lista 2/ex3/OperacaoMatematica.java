public class OperacaoMatematica {
    private double operando1;
    private double operando2;

    public OperacaoMatematica(double operando1, double operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public Resultado realizarCalculo(int tipoOperacao, Usuario usuario, int dia, int mes, int ano){
        double resultadoCalculo = 0;
        String tipo = "";

        switch(tipoOperacao){
            case 1:
                resultadoCalculo = operando1 + operando2;
                tipo = "Soma";
                break;
            case 2:
                resultadoCalculo = operando1 - operando2;
                tipo = "Subtração";
                break;
            case 3:
                resultadoCalculo = operando1 * operando2;
                tipo = "Produto";
                break;
            case 4:
                resultadoCalculo = operando1 / operando2;
                tipo = "Coeficiente";
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        return new Resultado(usuario, tipo, dia, mes, ano, resultadoCalculo);
    }
}
