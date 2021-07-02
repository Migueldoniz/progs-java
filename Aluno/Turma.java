import java.util.Scanner;
import java.util.ArrayList;
public class Turma {

    Scanner sc = new Scanner(System.in);
    ArrayList<Aluno> turma = new ArrayList<>();
    
    public Turma(){
    }

    public void addAluno(){
         Aluno aluno = new Aluno();
         System.out.printf("Insira o nome do aluno: ");
         aluno.setNome(sc.nextLine());
         
         System.out.printf("Insira a idade de "+aluno.getNome()+": " );
         aluno.setIdade(sc.nextInt());
         sc.nextLine();
         System.out.printf("Insira o sexo de "+aluno.getNome()+": (M/F) ");
         aluno.setSexo(sc.next().charAt(0));
         System.out.printf("Insira quantas faltas "+aluno.getNome()+" possui: ");
         aluno.setFaltas(sc.nextInt());
         sc.nextLine();
         System.out.printf("Insira a media de "+aluno.getNome()+": ");
         aluno.setMedia(sc.nextDouble());
         sc.nextLine();

        turma.add(aluno);
        
    }
    public void removeAluno(){
        String nome;
        int i;
        if(turma.isEmpty()){
            System.out.println("\tNao e possivel remover, pois nao possuem alunos cadastrados\n\n");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else{
        System.out.println("Insira o nome do aluno a ser removido: ");
            //sc.nextLine();
            nome = sc.nextLine();
            for(i=0;i<turma.size();i++){
                if(turma.get(i).getNome().equals(nome)){
                    turma.remove(i);
                    System.out.println("\tAluno removido com sucesso\n\n");
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    break;
                }
            }
            if(i==turma.size() && i>1){
                System.out.println("\tAluno nao encontrado\n\n");
                try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            }
        }
    }

    public void mostraAluno(){
        if(turma.isEmpty()){
            System.out.println("\tNão há alunos cadastrados.");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}

        }
        else{
        System.out.println("\n\t-Lista de alunos-");
        for(int i=0; i<turma.size(); i++)
        {
            System.out.println("Registro [" + (i+1) + "]");
            System.out.println(turma.get(i).getNome());
            System.out.println(turma.get(i).getIdade()+" anos");
            System.out.println("Sexo: " + turma.get(i).getSexo());
            System.out.println(turma.get(i).getFaltas()+" faltas");
            System.out.println("Média: " + turma.get(i).getMedia());
        }
        try { Thread.sleep (1000); } catch (InterruptedException ex) {}

    }
    }
        
    
}
