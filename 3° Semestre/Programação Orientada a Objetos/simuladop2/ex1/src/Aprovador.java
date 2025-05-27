abstract class Aprovador {
    public Aprovador prox;
    public Aprovador(Aprovador prox){
        this.prox = prox;
    }
    public abstract void aprovar(SolicitacaoCompra S);

    public void setProx(Aprovador prox) {
        this.prox = prox;
    }

    public Aprovador getProx() {
        return prox;
    }
}
