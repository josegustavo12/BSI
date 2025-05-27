public class App {
    public static void main(String[] args) throws Exception {

        // criacao das compras
        SolicitacaoCompra S1 = new SolicitacaoCompra(100, "Arroz");
        SolicitacaoCompra S2 = new SolicitacaoCompra(5000, "Tablet");
        SolicitacaoCompra S3 = new SolicitacaoCompra(100000, "Prédio");

        Aprovador pipeline = 
        new Supervisor(
            new Gerente(
                new Diretor(null)
            )
        );

        SolicitacaoCompra[] lista = {S1, S2, S3};

        for (SolicitacaoCompra i : lista){
            pipeline.aprovar(i);
        }
    }
}
