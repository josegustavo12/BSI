public class multiplo2 extends abstracthandler {
    public multiplo2(abstracthandler proximo){
        super(proximo);
    }

    public void processar(int num){
        if (num % 2 == 0){
            System.out.println("Multiplo de 2: "+num+" | Quadrado: " + Math.pow(num, 2) + " | Raiz: " + Math.sqrt(num));
        }
        else{
            proximo.processar(num);
        }
    }
}
