public class Logger{

    private static Logger instancia;

    public Logger(){}


    public static synchronized Logger getInstancia(){
        if (instancia == null){ // verifica se a instancia é vazia 
            instancia = new Logger(); // se for -> retorna a instancia
        }
        return instancia;
    }   

    public void Registrar(String msg){
        System.out.println(msg);
    }
}