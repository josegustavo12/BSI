public class Pix implements MetodoPagamento {
    private String chave;

    public Pix(String chave){
        this.chave = chave;
    }


    @Override
    public void Pagar(double valor){
        System.out.println("Pagamento de " + valor + " para a chave " + chave);
    }


    @Override
    public float getTaxa(){
        return 1.0f;
    }
}