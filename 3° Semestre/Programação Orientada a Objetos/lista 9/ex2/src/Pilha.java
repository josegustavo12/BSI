import java.util.LinkedList;
import java.util.Queue;

class Pilha{
    Queue<Character> stack = new LinkedList<>();
    int tamanho = 0;
    public Pilha(Queue<Character> stack){
        this.stack = stack;
    }



    public void push (Character a){
        stack.add(a);
        tamanho++;
    }

    public Character pop(){
        Character tmp = stack.peek();
        stack.remove(tamanho);
        tamanho--;
        return tmp;
    }
}