public class Gerente extends Aprovador{

    public Gerente(Aprovador prox){
        super(prox);
    }

    @Override
    public void aprovar(SolicitacaoCompra S){
        if (S.getPreco() < 10000){
            System.out.println("Compra: " + S.getDesc() + " Aprovada pelo Gerente");
        }
        else{
            prox.aprovar(S);
        }
    }
}
