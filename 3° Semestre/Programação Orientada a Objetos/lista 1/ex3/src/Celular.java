public class Celular {
    private Processador processador;
    private Som som;
    private Tela tela;

    public Celular(Processador processador, Som som, Tela tela) {
        this.processador = processador;
        this.som = som;
        this.tela = tela;
    }

    public void mostrarDetalhes(){
        System.out.println("Detalhes do celular:");
        processador.MostrarProcessador();
        som.MostrarSom();
        tela.MostrarTela();
    }
}
