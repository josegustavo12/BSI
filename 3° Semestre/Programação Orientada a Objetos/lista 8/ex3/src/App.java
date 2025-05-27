public class App {
    public static void main(String[] args) {
        // Criando a árvore binária de inteiros
        tree<Integer> arvore = new tree<>();

        // Inserindo elementos
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);

        // Impressão em ordem (deve estar ordenado)
        System.out.print("Elementos em ordem: ");
        arvore.emOrdem();  // Esperado: 20 30 40 50 60 70 80

        // Testando buscas
        System.out.println("Buscar 60? " + arvore.buscar(60)); // true
        System.out.println("Buscar 15? " + arvore.buscar(15)); // false
    }
}
