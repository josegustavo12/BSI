public class Diretor extends Aprovador{

    public Diretor(Aprovador prox){
        super(prox);
    }
    @Override
    public void aprovar(SolicitacaoCompra S){

        System.out.println("Compra: " + S.getDesc() + " Aprovada pelo Diretor");
    }
}
