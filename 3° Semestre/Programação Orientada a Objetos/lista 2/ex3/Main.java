public class Main {
    public static void main(String[] args){
        // Criar usuários
        Usuario u1 = new Usuario("João", 22, "111.222.333-44");
        Usuario u2 = new Usuario("Maria", 30, "555.666.777-88");

        // Realizar operações matemáticas
        OperacaoMatematica op1 = new OperacaoMatematica(10.5, 5.5);
        Resultado r1 = op1.realizarCalculo(1, u1, 18, 3, 2025); // Soma

        OperacaoMatematica op2 = new OperacaoMatematica(20, 8);
        Resultado r2 = op2.realizarCalculo(4, u2, 18, 3, 2025); // Divisão

        // Exibir resultados
        r1.mostrarDados();
        r2.mostrarDados();
    }
}
