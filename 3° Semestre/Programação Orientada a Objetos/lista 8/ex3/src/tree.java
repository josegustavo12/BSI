public class tree <T extends Comparable<T>>{
    public noh raiz;

    public tree(){
        this.raiz = null;
    }

    public void inserir (T valor){
        raiz = inserirrecursivo(raiz, valor);
    }

    public noh<T> inserirrecursivo(noh<T> atual, T valor){
        if (atual == null){
            return new noh(valor); // se o noh tiver vázio retorna o noh com o valor direto
        }

        if (valor.compareTo(atual.valor) > 0){ // valor > atual -> vai pra direita
            atual.direita = inserirrecursivo(atual.direita, valor);
        }
        else{
            atual.esquerda = inserirrecursivo(atual.esquerda, valor); // valor <= atual -> vai pra esquerda 
        }

        return atual;
    }

    public boolean buscar(T valor){
        return buscarrecursivo(raiz, valor);
    }

    public boolean buscarrecursivo(noh<T> atual, T valor){

        if (atual == null) {
        return false;
        }
        if (valor.compareTo(atual.valor) > 0) { // se o valor for maior o atual -> direita
            return buscarrecursivo(atual.direita, valor);
        }
        if (valor.compareTo(atual.valor) < 0) { // mesma coisa, so que o contrario
            return buscarrecursivo(atual.esquerda, valor);
        }
        if (valor.compareTo(atual.valor) == 0){
            return true;
        }
        return false;   

    }

    public void emOrdem() {
        emOrdemRecursivo(raiz);
        System.out.println();
    }

    private void emOrdemRecursivo(noh<T> atual) {
        if (atual != null) {
            emOrdemRecursivo(atual.esquerda);
            System.out.print(atual.valor + " ");
            emOrdemRecursivo(atual.direita);
        }
    }

}
