
public class Pedido {
    int TamMax;
    Item[] itensDoPedido;
    int length = 0;

    // tamanho do pedido
    public Pedido(int TamMax){
        this.TamMax = TamMax;
        itensDoPedido = new Item[TamMax];
    }

    // add itens
    public void adicionarItem(Item Item){
        if (length < TamMax){
            itensDoPedido[length] = Item; // talvez pudesse usar o itensDoPedido.add(Item) e remover o length
            length++;
        }
        else{
            System.out.println("Pedido cheio");
        }
    }

/*     // remove itens
    public void removerItem(Item Item){
        if (length > 0){
            itensDoPedido[length] = null;
            length--;
        }
        else{
            System.out.println("Pedido vazio");
        }
    } */

    // exibir pedido
    public void exibirPedido(){
        System.out.println("************ Pedido ************");
        for (int i = 0; i < length; i++){
            Item item = itensDoPedido[i];
            System.out.println("Item: " + item.nome);
            System.out.println("Preço: " + item.preco);
            System.out.println("Quantidade: " + item.quantidade);
        }
    }

    // total do pedido
    public double totalPedido(){
        double total = 0;
        for (int i = 0; i < length; i++){  // usa length, não o array inteiro
            Item item = itensDoPedido[i];
            total += item.preco * item.quantidade;
        }
        return total;
    }
    
    }


