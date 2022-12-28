package Principal;

import java.util.*;
import java.util.Map;

public class Principal {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    Map<String, Livros> mapalivros = new HashMap<>();
    
    char op='s';
    while(op=='s'){
    Livros livro = new Livros();
    System.out.println("\n\n\n--------Sistema de Cadastro de Livros---------");
    System.out.print("Insira a opção que deseja:\n1. Cadastrar livro;\n2.Consultar livro;\nop: ");
    int opa=sc.nextInt();
    sc.nextLine();
    switch (opa){
    
    case 1:
    System.out.print("Insira o código ISBN do livro: ");
    livro.setISBN(sc.nextLine());
    System.out.print("Insira o título do livro: ");
    livro.setTítulo(sc.nextLine());
    System.out.print("Insira o autor do livro: ");
    livro.setAutor(sc.nextLine());
    System.out.print("Insira a editora do livro: ");
    livro.setEditora(sc.nextLine());
    System.out.print("Insira o número de páginas do livro: ");
    livro.setNumpag(sc.nextInt());
    sc.nextLine();
    System.out.print("Insira o ano do livro: ");
    livro.setAno(sc.nextInt());
    sc.nextLine();
    mapalivros.put(livro.getISBN(), livro);
    System.out.println("Livro Cadastrado com sucesso!");
    System.out.print("\n\nDeseja continuar no programa? (s/n): ");
        op=sc.next().charAt(0);
        sc.nextLine();
    break;
    
    case 2:
        System.out.print("Insira o código ISBN do livro a ser pesquisado: ");
        String ISBN = sc.nextLine();
        Livros pesquisa = mapalivros.get(ISBN);
        if (pesquisa==null){
            System.out.println("Livro não encontrado bro, tenta de novo ai.");
            break;
        }
        else{
        System.out.println("\n\nNome do livro: "+pesquisa.getTítulo());
        System.out.println("ISBN: "+pesquisa.getISBN());
        System.out.println("Autor: "+pesquisa.getAutor());
        System.out.println("Editora: "+pesquisa.getEditora());
        System.out.println(pesquisa.getNumpag()+" páginas");
        System.out.println("Ano: "+pesquisa.getAno());
        System.out.print("\n\nDeseja continuar no programa? (s/n): ");
        op=sc.next().charAt(0);
        sc.nextLine();
        break;
        }
        
    }
            }
    }
}
