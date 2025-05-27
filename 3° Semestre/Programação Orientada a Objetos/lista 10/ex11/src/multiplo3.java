public class multiplo3 extends abstracthandler {
    public multiplo3(abstracthandler proximo){
        super(proximo);
    }

    public void processar(int num){
        if (num % 3 == 0){
            System.out.println("Multiplo de 3: "+num+" | Quadrado: " + Math.pow(num, 2) + " | Raiz: " + Math.sqrt(num));
        }
        else{
            proximo.processar(num);
        }
    }
}
