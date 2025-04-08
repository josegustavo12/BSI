public class aviao implements Reservavel{
    String voo;
    String aviao;
    String data;
    
    public aviao (String voo, String aviao, String data){
        this.voo = voo;
        this.aviao = aviao;
        this.data = data;
    }

    public void reservar(){
        System.out.println("Reserva do voo realizada, dados:\n" + toString());
    }

    @Override
    public String toString(){
        return "voo: " + aviao + " | avião: " + aviao + " | data: " + data;
    }
}
