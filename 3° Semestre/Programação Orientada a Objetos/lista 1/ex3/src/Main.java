public class Main {
    public static void main(String[] args) {
        Processador processador_s20 = new Processador("intel", 4, 2020);
        Som som_s20 = new Som("JBL", 70, 50);
        Tela tela_s20 = new Tela("samsung", 5, "full HD", true);
        Celular s20 = new Celular(processador_s20, som_s20, tela_s20);

        s20.mostrarDetalhes();
        som_s20.aumentarVolume(20);
        s20.mostrarDetalhes();

    }
}