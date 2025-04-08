public class Reserva {
    private Reservavel item;

    public Reserva(Reservavel item){
        this.item = item;
    }

    public void realizarReserva(){
        item.reservar();
    }
}
