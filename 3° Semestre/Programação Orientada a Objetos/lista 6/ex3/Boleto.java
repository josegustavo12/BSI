public class Boleto implements MetodoPagamento{
    private String Codigo;
    private String Vencimento;

    public Boleto (String Codigo, String Vencimento){
        this.Codigo = Codigo;
        this.Vencimento = Vencimento;
    }
    @Override
    public void Pagar (double valor){
        System.out.println("Boleto no valor: " + valor + " Pago");
    }
    @Override
    public float getTaxa(){
        return 2.0f;
    }
}
