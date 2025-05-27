abstract class abstracthandler {
    protected abstracthandler proximo;
    public abstracthandler(abstracthandler proximo){
        this.proximo = proximo;
    }

    public abstract void processar(int num);
}
