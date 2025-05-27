public class Multi implements InterfaceOP {
    public double[] Calcular(Vetors vet) {
        double[] v1 = vet.getVet1();
        double[] v2 = vet.getVet2();
        return new double[] {
            v1[1]*v2[2] - v1[2]*v2[1],
            v1[2]*v2[0] - v1[0]*v2[2],
            v1[0]*v2[1] - v1[1]*v2[0]
        };
    }
}
