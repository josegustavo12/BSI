public class Gen <T extends Comparable<T>> {
    T n1;
    T n2;

    public Gen(T n1, T n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public T getMax(){ // considerando que NUNCA serão iguais
        int res = n1.compareTo(n2);
        if (res > 0){
            return this.n1;
        }
        else{
            return this.n2;
        }
    }

    public T getMin(){
        int res = n1.compareTo(n2);
        if (res > 0){
            return this.n2; // inverte, caso n1 seja maior que n2, retorna n2
        }
        else{
            return this.n1;
        }
    }

    @Override
    public String toString(){
        return getMax() + "" + getMin();
    }
}
