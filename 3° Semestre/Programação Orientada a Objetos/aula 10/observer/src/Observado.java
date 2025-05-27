public interface Observado {
    void addParticipante(Observador o);
    void removeParticipante(Observador O);
    void notificar(String noticia);
}
