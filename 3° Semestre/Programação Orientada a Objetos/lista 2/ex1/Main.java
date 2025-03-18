public class Main {
    public static void main(String[] args){
        Polinomio p1 = new Polinomio(5);
        
        Termo t1 = new Termo(2, 3); // grau, coeficiente
        Termo t2 = new Termo(3, 4);
        Termo t3 = new Termo(4, 2);
        
        p1.Add(t1);
        p1.Add(t2);
        
        p1.MostrarPolinomio();
        System.out.println("Resultado (x = "+ 2 + "): " + p1.CalcularPolinomio(2));
        
        p1.Add(t3);
        
        p1.MostrarPolinomio();
        System.out.println("Resultado (x = " + 2 + "): " + p1.CalcularPolinomio(2));
    }
}
