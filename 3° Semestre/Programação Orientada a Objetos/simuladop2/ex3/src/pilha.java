public class pilha <T>{

    private T[] array;
    int head = 0;

    public pilha(T array[]){
        this.array = array;
    }

    public void push (T valor){
        array[head] = valor;
        head++;
    }

    public T pop(){
        head--;
        T tmp = array[head];
        array[head] = null; // limpa a posição
        return tmp;
    }

    public void imprimir(){
        for (T i : array){
            System.out.println(i);
        }
    }
}
