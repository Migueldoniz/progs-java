import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    public static void main (String args[]){
        int op=1;
        Scanner sc = new Scanner(System.in);
        Livraria livro = new Livraria();
        while (op!=0){
            System.out.println("\n\nOla, digite a opcao de sua escolha:\n1- Para adicionar um livro;\n2- Para remover um livro;\n3- Para exibir os livros cadastrados;\n4- Para editar algum dado de um livro;\n0- Para encerrar o programa.\nop: ");
            op=sc.nextInt();

        switch (op){
            
            case 1:
            livro.addLivro();
            break;

            case 2:
            livro.removeLivros();
            break;

            case 3:
            livro.mostraLivros();
            break;

            case 4:
            livro.editLivro();
            break;

            

        }
        
    

        }
    }
    
}
