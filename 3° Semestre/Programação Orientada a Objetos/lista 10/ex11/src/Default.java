public class Default extends abstracthandler {
    public Default(){
        super(null);
    }

    public void processar(int num){
        System.out.println("Nem multiplo de 2 nem de 3: "+num+" | Quadrado: " + Math.pow(num, 2) + " | Raiz: " + Math.sqrt(num));
    }
}
