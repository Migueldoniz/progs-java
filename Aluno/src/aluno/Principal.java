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
import java.io.*;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        int op=1;
        char opin;
        Scanner sc = new Scanner(System.in);
        Turma turma= new Turma();
        Corpodocente Professores= new Corpodocente();
        Arquivo arq = new Arquivo();
        
        
        System.out.print("Deseja importar dados de professores e alunos de algum diretório? (s/n): ");
        opin=sc.next().charAt(0);
        sc.nextLine();
        if(opin=='s'){
            String nomen;
            System.out.print("Insira o nome do arquivo que deseja restaurar dados de alunos: ");
            nomen=sc.nextLine();
            arq.recup(nomen, turma);
            System.out.println("Dados restaurados com sucesso do arquivo '"+nomen+"'!");
            File file = new File(nomen); file.delete(); 
            try { Thread.sleep (1500); } catch (InterruptedException ex) {}
            System.out.print("Insira o nome do arquivo que deseja restaurar dados de professores: ");
            nomen=sc.nextLine();
            arq.recup(nomen, Professores);
            System.out.println("Dados restaurados com sucesso do arquivo '"+nomen+"'!");
            file.delete();
            try { Thread.sleep (1500); } catch (InterruptedException ex) {}
        }
                while(op!=0){
                System.out.println("\n\nOla, digite a opcao de sua escolha:\n1- Para adicionar aluno;\n2- Para remover um aluno;\n3- Para exibir os alunos cadastrados;\n4- Para adicionar um professor;\n5- Para remover um professor;\n6- Para exibir os professores cadastrados;\n0- Para encerrar o programa;\nop: ");
                op=sc.nextInt();
                sc.nextLine();

                switch (op){
                    case 0:
                    char opi;
                    System.out.print("Deseja salvar os dados de alunos e professores antes de sair? (s/n): ");
                    opi=sc.next().charAt(0);
                    sc.nextLine();
                    if(opi=='s'){
                    String name;
                    System.out.print("Insira o nome do arquivo que deseja salvar os dados dos Alunos: ");
                    name=sc.nextLine();
                    arq.salva(name,turma);
                    System.out.println("Dados salvos com sucesso no arquivo '"+name+"'!");
                    try { Thread.sleep (1500); } catch (InterruptedException ex) {}
                    System.out.print("Insira o nome do arquivo que deseja salvar os dados dos Professores: ");
                    name=sc.nextLine();
                    arq.salva(name,Professores);
                    System.out.println("Dados salvos com sucesso no arquivo '"+name+"'!");
                    System.out.println("Saindo do sistema...");
                    try { Thread.sleep (1500); } catch (InterruptedException ex) {}
                    }
                    else{
                    op=0;}
                    break;

                    case 1:
                    turma.addAluno();
                    break;

                    case 2:
                    turma.removeAluno();
                    break;

                    case 3:
                    turma.mostraAluno();
                    break;

                    case 4:
                    Professores.addProfessor();
                    break;

                    case 5:
                    Professores.removeProfessor();
                    break;

                    case 6:
                    Professores.mostraProfessor();
                    break;
                    default:
                        System.out.println("Opção inválida, digite alguma das opções a seguir:");
                    break;



                }
                }











                /*Aluno Ana = new Aluno("Ana Maria da Silva",18,'F',0,true,8.3);
                Professor Jose = new Professor("Jose de Alencar Bastos",43,'M',2,true,"Analise de Dados",60);
                Funcionario Milton = new Funcionario("Milton Nascimento dos Santos",57,'M',0,false,"Zelador");
                System.out.println("\tAlunos:");
                System.out.println(Ana.getNome());
                System.out.println(Ana.getIdade()+" anos");
                System.out.print("Sexo: ");
                Ana.setSexo(Ana.getSexo());
                System.out.println("Quantidade de Faltas: "+Ana.getFaltas());
                System.out.print("Cadastro: ");
                Ana.setAtivo(Ana.getAtivo());
                System.out.println("Média: "+Ana.getMedia());
                System.out.println("\n\n");
                System.out.println("\tProfessores:");
                System.out.println(Jose.getNome());
                System.out.println(Jose.getIdade()+" anos");
                System.out.print("Sexo: ");
                Jose.setSexo(Jose.getSexo());
                System.out.println("Quantidade de Faltas: "+Jose.getFaltas());
                System.out.print("Cadastro: ");
                Jose.setAtivo(Jose.getAtivo());
                System.out.println("Materia lecionada: "+Jose.getMateria());
                System.out.println("Quantidade de horas aula: "+Jose.getHoraAula());
                System.out.println("\n\n");
                System.out.println("\tFuncionarios:");
                System.out.println(Milton.getNome());
                System.out.println(Milton.getIdade()+" anos");
                System.out.print("Sexo: ");
                Milton.setSexo(Milton.getSexo());
                System.out.println("Quantidade de Faltas: "+Milton.getFaltas());
                System.out.print("Cadastro: ");
                Milton.setAtivo(Milton.getAtivo());
                System.out.println("Cargo: "+Milton.getCargo());
        */
            }

}