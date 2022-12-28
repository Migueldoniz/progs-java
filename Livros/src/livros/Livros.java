/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;

/**
 *
 * @author migue
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Livros {
    int i,j=0;
    Scanner sc = new Scanner(System.in);
    private String isbn;
    private String nome;
    ArrayList<String> autores = new ArrayList<>();
    private String editora;
    private int anodepub;
    private int pags;
    
    //isbn
    public String getIsbn(){
        return this.isbn;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    } 

    //nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    //autores
    public void getAutores(){
            System.out.println(autores);
    }
    public void setAutores(String autor){
            autores.add(autor);
    }
    public void mudAutores(int i){
        String autor;
        int l;
        for (int j=0;j<i;j++){
            l=j;
        System.out.println("Insira o "+(l+1)+"° autor");
        autor=sc.next();
        autores.set(j,autor);
        }
    }
    //editora
    public String getEditora(){
        return this.editora;
    }
    public void setEditora(String editora){
        this.editora=editora;
    }

    //ano de pub
    public int getAnodepub(){
        return this.anodepub;
    }
    public void setAnodepub(int anodepub){
        this.anodepub=anodepub;
    }

    //pags
    public int getPags(){
        return this.pags;
    }
    public void setPags(int pags){
        this.pags=pags;
    }
    
    public Livros(){}
    

    

    
}
