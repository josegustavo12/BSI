public class App {
    public static void main(String[] args) throws Exception {
        int[] lista = {1,2,3,4,5,6,7,8,9,10};
        multiplo2 pipeline = new multiplo2(new multiplo3(new Default()));
        for(int i : lista){
            pipeline.processar(i);
        }
    }
}

/* 
Handlermultiplo2 → Handlermultiplo2 → HandlerDefault
     ↓              ↓                   ↓
  (multiplo2)        (multiplo2)    (outros)
 */
