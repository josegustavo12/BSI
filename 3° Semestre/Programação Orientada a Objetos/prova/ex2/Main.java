public class Main {
    public static void main(String[] args) {
        Reservavel reserva1 = new hotel("Thermas","José",5);
        Reservavel reserva2 = new aviao("ABC123", "airbus737", "17/09/2025");

        Reserva r1 = new Reserva(reserva1);
        Reserva r2 = new Reserva(reserva2);

        r1.realizarReserva();
        r2.realizarReserva();
        
    }    
}
