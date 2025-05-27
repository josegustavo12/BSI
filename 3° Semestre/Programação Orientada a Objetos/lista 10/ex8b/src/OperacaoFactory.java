public class OperacaoFactory {

    public OperacaoFactory(){}
    
    public static Operacao criar(String op){
        switch (op) {
            case "União":
                return new Uniao();

            case "Interseccção":
                return new Interseccao();
            
            case "Diferença":
                return new Diferenca();
            default:
                System.out.println("Opção inválida, retornando união");
                return new Uniao();
        }
    }
}
