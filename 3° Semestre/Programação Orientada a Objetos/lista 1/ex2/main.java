public class main {
    public static void main(String[] args){
        Pedido p1 = new Pedido(5);
        Item arroz = new Item("Arroz", 5.50, 10);
        Item feijao = new Item("Feijão", 7.50, 5);
        Item carne = new Item("Carne", 15.50, 3);
        Item leite = new Item("Leite", 3.50, 15);
        Item pao = new Item("Pão", 2.50, 20);
        p1.adicionarItem(arroz);
        p1.adicionarItem(feijao);
        p1.exibirPedido();
        System.out.println("-------------------------------------");
        System.out.println("Total do pedido: " + p1.totalPedido());
        System.out.println("-------------------------------------");
        p1.adicionarItem(carne);
        p1.adicionarItem(leite);
        p1.adicionarItem(pao);
        p1.exibirPedido();
        System.out.println("-------------------------------------");
        System.out.println("Total do pedido: " + p1.totalPedido());
        System.out.println("-------------------------------------");    
    }
}
