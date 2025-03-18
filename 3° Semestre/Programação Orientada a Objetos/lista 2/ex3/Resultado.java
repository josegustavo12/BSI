public class Resultado {
    Usuario usuario;
    String tipo;
    int dia;
    int mes;
    int ano;
    double resultado;
    
    public Resultado(Usuario usuario, String tipo, int dia, int mes, int ano, double resultado){
        this.usuario = usuario;
        this.tipo = tipo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.resultado = resultado;
    }

    public void mostrarDados(){
        System.out.println("Operação realizada por: " + usuario.getNome());
        System.out.println("Tipo da operação: " + tipo);
        System.out.printf("Data: %02d/%02d/%d\n", dia, mes, ano);
        System.out.println("Resultado: " + resultado);
        System.out.println("------------------------");
    }
}
