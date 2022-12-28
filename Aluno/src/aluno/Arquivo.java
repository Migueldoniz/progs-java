/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author migue
 */
public class Arquivo {
    private int cont=0;
    private int cont1=0;
    
    public void salva(String nomearq, Turma turma){
        try{
        String caminho = "C:\\Users\\migue\\Desktop\\Nova pasta\\";
        File arq = new File(caminho+nomearq);
        FileWriter escritor = new FileWriter(arq, false);
        BufferedWriter bw = new BufferedWriter(escritor);
        if(cont==0){
        bw.write("Nome;idade;sexo;faltas;ativo;media\n");
        
       
        for(int i=0; i<turma.turma.size();i++){
            bw.write(turma.turma.get(i).getNome()+";"+turma.turma.get(i).getIdade()+";"+turma.turma.get(i).getSexo()+";"+turma.turma.get(i).getFaltas()+";"+turma.turma.get(i).getAtivo()+";"+turma.turma.get(i).getMedia()+";");
            bw.write("\n");
            cont++;
        }}
        else{
            for( int i=cont; i<turma.turma.size();i++){
            bw.write(turma.turma.get(i).getNome()+";"+turma.turma.get(i).getIdade()+";"+turma.turma.get(i).getSexo()+";"+turma.turma.get(i).getFaltas()+";"+turma.turma.get(i).getAtivo()+";"+turma.turma.get(i).getMedia()+";");
            bw.write("\n");
            cont++;
            }
            
        }
        bw.close();
        escritor.close();
        
         
        }
        catch(IOException e){
        System.out.println("Rolou não parsero, tenta de novo ai!");
    }
        
    }
    public void salva(String nomearq, Corpodocente Professores){
        try{
        String caminho = "C:\\Users\\migue\\Desktop\\Nova pasta\\";
        File arq = new File(caminho+nomearq);
        FileWriter escritor = new FileWriter(arq, false);
        BufferedWriter bw = new BufferedWriter(escritor);
        if(cont1==0){
        bw.write("Nome;idade;sexo;faltas;ativo;materia;hora/aula;\n");
        
       
        for(int i=0; i<Professores.Professores.size();i++){
            bw.write(Professores.Professores.get(i).getNome()+";"+Professores.Professores.get(i).getIdade()+";"+Professores.Professores.get(i).getSexo()+";"+Professores.Professores.get(i).getFaltas()+";"+Professores.Professores.get(i).getAtivo()+";"+Professores.Professores.get(i).getMateria()+";"+Professores.Professores.get(i).getHoraAula());
            bw.write("\n");
            cont1++;
        }}
        else{
            for( int i=cont1; i<Professores.Professores.size();i++){
            bw.write(Professores.Professores.get(i).getNome()+";"+Professores.Professores.get(i).getIdade()+";"+Professores.Professores.get(i).getSexo()+";"+Professores.Professores.get(i).getFaltas()+";"+Professores.Professores.get(i).getAtivo()+";"+Professores.Professores.get(i).getMateria()+";"+Professores.Professores.get(i).getHoraAula());
            bw.write("\n");
            cont1++;
            }
            
        }
        bw.close();
        escritor.close();
        
         
        }
        catch(IOException e){
        System.out.println("Rolou não parsero, tenta de novo ai!");
    }
        
    }
    public void recup(String nomearq, Turma turma){
        try{
        String caminho = "C:\\Users\\migue\\Desktop\\Nova pasta\\";
        File arq = new File(caminho+nomearq);
        FileReader arqui = new FileReader(arq);
        BufferedReader br = new BufferedReader(arqui);
        String[] line;
        String linha;
        linha=br.readLine();
        while(br.ready()){
            String lixo;
            linha=br.readLine();
            line=linha.split(";");
            Aluno recupturma = new Aluno();
            recupturma.setNome(line[0]);
            recupturma.setIdade(Integer.parseInt(line[1]));
            recupturma.setSexo(line[2].charAt(0));
            recupturma.setFaltas(Integer.parseInt(line[3]));
            recupturma.setAtivo(Boolean.parseBoolean(line[4]));
            recupturma.setMedia(Double.parseDouble(line[5]));
            turma.turma.add(recupturma);
        }
        }
        catch(IOException e){
        System.out.println("Rolou não parsero, tenta de novo ai!");
    }
        
    }
    public void recup(String nomearq, Corpodocente Professores){
        try{
        String caminho = "C:\\Users\\migue\\Desktop\\Nova pasta\\";
        File arq = new File(caminho+nomearq);
        FileReader arqui = new FileReader(arq);
        BufferedReader br = new BufferedReader(arqui);
        String[] line;
        String linha;
        linha=br.readLine();
        while(br.ready()){
            linha=br.readLine();
            line=linha.split(";");
            Professor recupcorpodocente = new Professor();
            recupcorpodocente.setNome(line[0]);
            recupcorpodocente.setIdade(Integer.parseInt(line[1]));
            recupcorpodocente.setSexo(line[2].charAt(0));
            recupcorpodocente.setFaltas(Integer.parseInt(line[3]));
            recupcorpodocente.setAtivo(Boolean.parseBoolean(line[4]));
            recupcorpodocente.setMateria(line[5]);
            recupcorpodocente.setHoraAula(Integer.parseInt(line[6]));
            Professores.Professores.add(recupcorpodocente);
        }
        }
        catch(IOException e){
        System.out.println("Rolou não parsero, tenta de novo ai!");
    }
        
    }
}
//acabar de deixar os ponto e virgula na entrada e adicionar no case