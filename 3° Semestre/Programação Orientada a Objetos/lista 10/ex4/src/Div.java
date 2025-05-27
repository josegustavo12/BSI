public class Div implements Operacao{
    double n1; double n2;

    public Div(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public double Calcular(double n1, double n2){
        if (n2 == 0){
            System.out.println("Denominador é zero, impossivel calcular");
            return 0;
        }
        else{
            return n1/n2;
        }
    }
}
