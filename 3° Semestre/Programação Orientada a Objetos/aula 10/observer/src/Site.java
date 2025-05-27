public class Site implements Observador{
    String site;
    public Site(String Site){this.site = Site;}

    public void update(String noticia){
        System.out.println("<Site> "+ site + ": \n" + noticia);
    }
}
