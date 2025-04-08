class Livro{
    public String titulo;
    public String autor;
    private boolean emprestado;
    
    
    public Livro (String titulo, String autor, boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = emprestado;
    }

    public boolean getEmprestado(){
        return this.emprestado;
    }

    public void setEmprestado(boolean bool){
        this.emprestado = bool;
    }

    public void Devolver(){
        this.setEmprestado(false);
    }

    @Override
    public String toString(){
        return "LIVRO\n" +
               "Titulo: " + titulo +
               "\nAutor: " + autor +
               "\nEmprestado: " + this.getEmprestado();
    }
    

}