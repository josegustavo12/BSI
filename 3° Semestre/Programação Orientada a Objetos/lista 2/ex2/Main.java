public class Main {
    public static void main(String[] args){
        DriversVideo d1 = new DriversVideo("NVIDIA GeForce RTX", "Placa de Vídeo", true, 50, 50, 1080);
        DriversImpressora d2 = new DriversImpressora("HP Deskjet 2130", "Impressora", true, 1080, 50);
        System.out.println("*********************** VIDEO ***********************");
        d1.MostrarDados();
        d1.AjustarBrilho(70);
        d1.AjustarContraste(80);
        d1.MostrarDados();
        System.out.println("*********************** IMPRESSORA ***********************");
        d2.MostrarDados();
    }    
}
