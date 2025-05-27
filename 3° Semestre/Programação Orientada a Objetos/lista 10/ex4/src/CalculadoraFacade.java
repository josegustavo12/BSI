public class CalculadoraFacade {
    public double Calcular(String op, double n1, double n2){
        return OperacaoFactor.OP(op, n1, n2).Calcular(n1, n2); // OperacaoFactor -> retorna o objeto correto | .Calcular(n1, n2) -> metodo para calcular
    }

    public double CalcularCompleto(String expressao){
        String[] elementos = expressao.trim().split(" "); // separa em n1 op n2
        return Calcular(elementos[1], Double.parseDouble(elementos[0]), Double.parseDouble(elementos[2]));
    }
}
