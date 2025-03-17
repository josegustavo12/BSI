public class Som {
    String nome;
    int potencia;
    int volume;

    public Som(String nome, int potencia, int volume){
        this.nome = nome;
        this.potencia = potencia;
        this.volume = volume;
    }
    public void aumentarVolume(int valor) {
        if (volume + valor <= 100) {
            volume += valor;
        } else {
            System.out.println("Volume máximo atingido");
        }
        System.out.println("Volume aumentado para: " + volume);
        int volumeAjustado = ajustarEqualizador();
        System.out.println("Equalizador ajustado, volume final: " + volumeAjustado);
    }

    private int ajustarEqualizador(){
        if (volume > 80) {
            System.out.println("Equalizador: Reduzindo os agudos para evitar distorção.");
        } else if (volume < 20) {
            System.out.println("Equalizador: Aumentando os graves para melhor percepção do som.");
        } else {
            System.out.println("Equalizador: Mantendo configurações padrão.");
        }
        return volume;
    }

    public void MostrarSom(){
        System.out.println("--------------------------------");
        System.out.println("Som: " + nome);
        System.out.println("Potencia(db): " + potencia);
        System.out.println("Volume: " + volume);
    }
}
