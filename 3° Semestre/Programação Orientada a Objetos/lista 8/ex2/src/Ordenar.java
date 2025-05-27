
public class Ordenar{

    public <T extends Comparable<T>> void InsertionSort (T[] array){
        for (int j = 1; j < array.length; j++) {
            T temp = array[j];
            int i = j - 1;

            while (i >= 0 && array[i].compareTo(temp) > 0) { // substituindo o uso do > por .compareTo -> é necessário comparar com > 0 por causa do return do compareTo
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = temp;
        }
    }

}