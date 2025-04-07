import java.util.ArrayList;


public class Estoque {

    private ArrayList<Produto> lista;
    public Estoque(){
        lista = new ArrayList<Produto>();
    }


    public void adicionarProduto(Produto produto){
        lista.add(produto);
    }
    public void removerProdutoporID(int id){
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).id == id){
                lista.remove(i);
                break;
            }
        }
    }

    public Produto buscarProdutoPorNome(String nome){
        Produto p = null;
        for (Produto i : lista){
            if (i.nome == nome){
                p = i;
            }
        }
        return p;
    }
        
    

    @Override
    public String toString(){
        String string = "";
        for (Produto i : lista){
            string += (i.toString() + "\n");
        }
        return string;
    }

}
