public class App {
    public static void main(String[] args) throws Exception {

        int[] c1 = {1,2,3};
        int[] c2 = {2,4,6};

        MeusVetores m = new MeusVetores(c1, c2, new Uniao());
        m.executar();
        

        m.setOp(new Interseccao());
        m.executar();

        m.setOp(new Diferenca());
        m.executar();
    }
}
