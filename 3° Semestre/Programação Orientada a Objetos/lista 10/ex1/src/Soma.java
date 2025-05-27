public class Soma implements InterfaceOP{
    public double[] Calcular(Vetors vet){
        double[] vet1 = vet.getVet1();
        double[] vet2 = vet.getVet2();
        double[] res = {
            vet1[0] + vet2[0],
            vet1[1] + vet2[1],
            vet1[2] + vet2[2]
        };
        return res;
    }
}
