public class noh<T> {
    T valor;
    noh<T> esquerda;
    noh<T> direita;

    public noh(T valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}
