import java.util.ArrayList;
import java.util.Scanner;
public class Livraria {
    
    Scanner sc = new Scanner(System.in);
    ArrayList<Livros> livraria = new ArrayList<>();
    int n,i;
    public Livraria(){

    }

    public void addLivro(){
        int i;
        Livros livro = new Livros();

        System.out.println("Insira o nome do livro a ser cadastrado:");
        livro.setNome(sc.nextLine());
        System.out.println("Insira o código isbn do livro "+livro.getNome()+":");
        livro.setIsbn(sc.nextLine());
        System.out.println("Insira quantos autores possui o livro "+livro.getNome()+":");
        n=sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o nome dos autores e tecle -Enter- ao final de cada nome:");
        for(i=0;i<n;i++){
            livro.setAutores(sc.nextLine());
        }
        System.out.println("Insira o nome da editora do livro "+livro.getNome()+":");
        livro.setEditora(sc.nextLine());
        System.out.println("Insira o ano de publicação do livro "+livro.getNome()+":");
        livro.setAnodepub(sc.nextInt());
        sc.nextLine();
        System.out.println("Insira a quantidade de páginas do livro "+livro.getNome()+":");
        livro.setPags(sc.nextInt());
        sc.nextLine();

        livraria.add(livro);
    }
    
    public void removeLivros(){
        String nome;
        int i;
        if(livraria.isEmpty()){
            System.out.println("\tNao e possivel remover, pois nao possuem livros cadastrados\n\n");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else{
        System.out.println("Insira o nome do livro a ser removido: ");
            //sc.nextLine();
            nome = sc.nextLine();
            for(i=0;i<livraria.size();i++){
                if(livraria.get(i).getNome().equals(nome)){
                    livraria.remove(i);
                    System.out.println("\tLivro removido com sucesso\n\n");
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    break;
                }
            }
            if(i==livraria.size() && i>1){
                System.out.println("\tLivro nao encontrado\n\n");
                try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            }
        }
    }

    public void mostraLivros(){
        if(livraria.isEmpty()){
            System.out.println("\tNão existem livros cadastrados.");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else{
        System.out.println("\n\t-Lista de livros-");
        for(int i=0; i<livraria.size(); i++)
        {
            System.out.println("Registro [" + (i+1) + "]");
            System.out.println(livraria.get(i).getNome());
            System.out.println("Cógigo ISBN: "+livraria.get(i).getIsbn());
            System.out.print("Autores: ");
            livraria.get(i).getAutores();
            System.out.println("Editora: "+livraria.get(i).getEditora());
            System.out.println("Publicado no ano " + livraria.get(i).getAnodepub());
            System.out.println(" " + livraria.get(i).getPags()+" páginas");
        }
        try { Thread.sleep (1000); } catch (InterruptedException ex) {}

    }
}

    public void editLivro(){
        String nomec,nome,name;
        int op=1;
        int num,m;
        if(livraria.isEmpty()){
            System.out.println("\tNão existem livros cadastrados.");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else{
            System.out.println("Insira o nome do livro que deseja editar: ");
                nome = sc.nextLine();
                for(i=0;i<livraria.size();i++){
                    if(livraria.get(i).getNome().equals(nome)){
                        while(op!=0){
                        
                        System.out.println("\n\n\nInsira a opção pra qual deseja editar:\n1- Para editar o nome;\n2- Para editar o código ISBN;\n3- Para editar os autores;\n4- Para editar a editora;\n5- Para editar o ano de publicação;\n6- Para editar o número de páginar;\n0- Para encerrar a alteração.\nop: ");
                        op=sc.nextInt();
                        sc.nextLine();

                        switch (op){
                            case 0:
                            break;

                            case 1:
                            System.out.println("Insira o novo nome do livro: ");
                            nomec=sc.nextLine();
                            livraria.get(i).setNome(nomec);
                            System.out.println("\tNome do livro alterado com sucesso\n\n");
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                            break;

                            case 2:
                            System.out.println("Insira o novo cógigo ISBN do livro: ");
                            nomec=sc.nextLine();
                            livraria.get(i).setIsbn(nomec);
                            System.out.println("\tCódigo ISBN do livro alterado com sucesso\n\n");
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                            break;
                            
                            case 3:
                            //livraria.get(i).clearAutores();
                            System.out.println("Insira quantos autores possui o livro: (Considere os que estão certos)");
                            m=sc.nextInt();
                            sc.nextLine();
                            livraria.get(i).mudAutores(n);
                            System.out.println("\tAutores alterados com sucesso\n\n");
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                            break;

                            case 4:
                            System.out.println("Insira a nova editora do livro: ");
                            nomec=sc.nextLine();
                            livraria.get(i).setEditora(nomec);
                            System.out.println("\tEditora do livro alterada com sucesso\n\n");
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                            break;

                            case 5:
                            System.out.println("Insira o novo ano de publicação do livro: ");
                            num=sc.nextInt();
                            livraria.get(i).setAnodepub(num);
                            System.out.println("\tAno de publicação do livro alterado com sucesso\n\n");
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                            break;

                            case 6:
                            System.out.println("Insira a nova quantidade de páginas do livro: ");
                            num=sc.nextInt();
                            livraria.get(i).setPags(num);
                            System.out.println("\tQuantidade de páginas do livro alterado com sucesso\n\n");
                            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                            break;

                            default:
                            System.out.println("Opção inválida\n");
                            break;

                        }
                        }
                    }
                }
                if(i==livraria.size() && i>1){
                    System.out.println("\tLivro nao encontrado\n\n");
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                }
            }
    }
}
