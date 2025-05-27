public class Sub implements Operacao {
    double n1; double n2;

    public Sub(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public double Calcular (double n1, double n2){
        return n1-n2;
    }
}
