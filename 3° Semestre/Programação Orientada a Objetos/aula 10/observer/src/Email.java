public class Email implements Observador{
    String email;
    public Email(String email){this.email = email;}

    public void update(String noticia){
        System.out.println("<Email> "+ email + ": \n" + noticia);
    }
}
