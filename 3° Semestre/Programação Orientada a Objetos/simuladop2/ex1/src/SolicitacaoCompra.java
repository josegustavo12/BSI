public class SolicitacaoCompra{
    private double preco;
    private String desc;
    
    public SolicitacaoCompra(double preco, String desc) {
        this.preco = preco;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public double getPreco() {
        return preco;
    }
}