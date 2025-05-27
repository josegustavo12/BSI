public class Vetors {
    protected double[] vet1;
    protected double[] vet2;

    public Vetors(double[] vet1, double[] vet2) {
        this.vet1 = vet1;
        this.vet2 = vet2;
    }
    

    public double[] Operacao(InterfaceOP operacao){
        return operacao.Calcular(this);
    }


    public double[] getVet1() {
        return vet1;
    }


    public double[] getVet2() {
        return vet2;
    }
}
