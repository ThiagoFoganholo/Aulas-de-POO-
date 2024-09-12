package model;

public class Livro {
    public String  titulo;
    public String  autor;
    public boolean emprestado;

    public	void emprestar(Livro livro1){
        System.out.println("livro esta emprestado");
        livro1.emprestado = true;
    }
    public	void devolver(Livro livro1){
        System.out.println("livro esta devolvido");
        livro1.emprestado = false;
    }
    public	void imprimir(){
        System.out.println("Titulo = " + titulo);
        System.out.println("Autor = " + autor);
        if(emprestado){
            System.out.println("Esta Emprestado");
        }else{
            System.out.println("Não Esta Emprestado");
        }
    }

}
