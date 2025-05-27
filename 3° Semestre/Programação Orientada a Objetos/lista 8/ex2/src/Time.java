public class Time implements Comparable <Time>{
    String nome; 
    int vitorias;

    public Time(String nome, int vitorias){
        this.nome = nome;
        this.vitorias = vitorias;
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }


    public int compareTo(Time outro){
        if (vitorias > outro.getVitorias()){
            return 1;
        }
        if (vitorias < outro.getVitorias()){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return "Time: " + nome + "| Vitorias: " + vitorias;
    }

}
