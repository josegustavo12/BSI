public class Supervisor extends Aprovador {

    public Supervisor(Aprovador prox){
        super(prox);
    }

    @Override
    public void aprovar(SolicitacaoCompra S){
        if (S.getPreco() < 1000){
            System.out.println("Compra: " + S.getDesc() + " Aprovada pelo Supervisor");
        }
        else{
            prox.aprovar(S);
        }
    }
}
