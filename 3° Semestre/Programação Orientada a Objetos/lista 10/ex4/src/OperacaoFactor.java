public abstract class OperacaoFactor{
    public static Operacao OP (String tipo, double n1, double n2){
        return switch(tipo){
            case "+" -> new Soma(n1, n2);
            case "-" -> new Sub(n1, n2);
            case "*" -> new Multi(n1, n2);
            case "/" -> new Div(n1, n2);
            default -> null;
        };
    }
}