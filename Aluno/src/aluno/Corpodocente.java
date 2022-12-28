/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author migue
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Corpodocente {

    Scanner sc = new Scanner(System.in);
    ArrayList<Professor> Professores = new ArrayList<>();
    
    public Corpodocente(){
    }

    public void addProfessor(){
         Professor professor = new Professor();
         System.out.printf("Insira o nome do professor: ");
         professor.setNome(sc.nextLine());
         System.out.printf("Insira a idade de "+professor.getNome()+": " );
         professor.setIdade(sc.nextInt());
         sc.nextLine();
         System.out.printf("Insira o sexo de "+professor.getNome()+": (M/F) ");
         professor.setSexo(sc.next().charAt(0));
         System.out.printf("Insira quantas faltas "+professor.getNome()+" possui: ");
         professor.setFaltas(sc.nextInt());
         sc.nextLine();
         System.out.printf("Insira a materia que "+professor.getNome()+" ministra: ");
         professor.setMateria(sc.nextLine());
         System.out.printf("Insira a quantidade de hora/aula que "+professor.getMateria()+" possui: ");
         professor.setHoraAula(sc.nextInt());
         sc.nextLine();

         Professores.add(professor);
        
    }
    public void removeProfessor(){
        String nome;
        int i;
        if(Professores.isEmpty()){
            System.out.println("\tNao e possivel remover, pois nao possuem professores cadastrados\n\n");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else{
        System.out.println("Insira o nome do professor a ser removido: ");
            //sc.nextLine();
            nome = sc.nextLine();
            for(i=0;i<Professores.size();i++){
                if(Professores.get(i).getNome().equals(nome)){
                    Professores.remove(i);
                    System.out.println("\tProfessor removido com sucesso\n\n");
                    try { Thread.sleep (1000); } catch (InterruptedException ex) {}
                    break;
                }
            }
            if(i==Professores.size() && i>1){
                System.out.println("\tProfessor nao encontrado\n\n");
                try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            }
        }
    }

    public void mostraProfessor(){
        if(Professores.isEmpty()){
            System.out.println("\tNão existem professores cadastrados.");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        else{
        System.out.println("\n\t-Lista de professores-");
        for(int i=0; i<Professores.size(); i++)
        {
            System.out.println("Registro [" + (i+1) + "]");
            System.out.println(Professores.get(i).getNome());
            System.out.println(Professores.get(i).getIdade()+ " anos");
            System.out.println("Sexo: " + Professores.get(i).getSexo());
            System.out.println(Professores.get(i).getFaltas()+" faltas");
            System.out.println("Materia: " + Professores.get(i).getMateria());
            System.out.println("Hora/aula: " + Professores.get(i).getHoraAula());
        }
        try { Thread.sleep (1000); } catch (InterruptedException ex) {}

    }
}
}
