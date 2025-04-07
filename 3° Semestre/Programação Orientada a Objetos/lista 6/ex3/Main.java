import java.util.ArrayList;
import java.util.List;


public class Main{
    public static void main(String[] args) {
        List<MetodoPagamento> pagamentos = new ArrayList<>();
    
        pagamentos.add(new Cartao(1000, "123456"));

        pagamentos.add(new Pix("josegustavovictor@gmail.com"));

        pagamentos.add(new Boleto("1548154878", "17/02/2008"));

        double valor = 300;
        double total = 0;

        for(MetodoPagamento metodo : pagamentos){
            metodo.Pagar(valor);
            total += metodo.getTaxa();
        }

        System.out.println("Custo total de taxas: " + total);



    }
}
