public class Cartao implements MetodoPagamento{
    private int Limite;
    private String Numero;

    public Cartao(int Limite, String Numero){
        this.Limite = Limite;
        this.Numero = Numero;
    }

    @Override
    public void Pagar(double valor){
        if (Limite < valor){
            System.out.println("Limite insuficiente");
        } else {
            System.out.println("Pagamento realizado com sucesso");
            Limite -= valor;
        } 
    }

    @Override
    public float getTaxa(){
        return 0.5f;
    }
}