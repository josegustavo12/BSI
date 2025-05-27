public class MeusVetores {
    int[] n1;
    int[] n2;
    Operacao op;
    public MeusVetores(int[] n1, int[] n2, Operacao op){
        this.n1 = n1; this.n2 = n2; this.op = op;
    }

    public void setOp(Operacao op){
        this.op = op;
    }

    public void executar(){
        op.Calcular(n1, n2);
    }
}
