package Principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class Livros {
    private String ISBN;
    private String Título;
    private String autor;
    private String editora;
    private int numpag;
    private int ano;

    public Livros(String ISBN, String Título, String autor, String editora, int numpag, int ano) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.autor = autor;
        this.editora = editora;
        this.numpag = numpag;
        this.ano = ano;
    }
    public Livros(){
        
    }   

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getNumpag() {
        return numpag;
    }

    public int getAno() {
        return ano;
    }
    
}
