/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author migue
 */
public class Arquivo {
    private int cont=0;
    private int cont1=0;
    
    public void salva(String nomearq, Livraria Livros){
        try{
        String caminho = "C:\\Users\\migue\\Desktop\\Nova pasta\\";
        File arq = new File(caminho+nomearq);
        FileWriter escritor = new FileWriter(arq, false);
        BufferedWriter bw = new BufferedWriter(escritor);
        if(cont==0){
        bw.write("Nome;ISBN;Editora;Quantidade de páginas;Ano de Publicação;Autores\n");
        
       
        for(int i=0; i<Livros.livraria.size();i++){
            bw.write(Livros.livraria.get(i).getNome()+";"+Livros.livraria.get(i).getIsbn()+";"+Livros.livraria.get(i).getEditora()+";"+Livros.livraria.get(i).getPags()+";"+Livros.livraria.get(i).getAnodepub());
                    for(int j=0; j<Livros.livraria.get(i).autores.size();j++){
                        bw.write(";"+Livros.livraria.get(i).autores.get(j));
                    }
                    bw.write("\n");
                    cont++;
        }}
        else{
            for( int i=cont; i<Livros.livraria.size();i++){
             bw.write(Livros.livraria.get(i).getNome()+";"+Livros.livraria.get(i).getIsbn()+";"+Livros.livraria.get(i).getEditora()+";"+Livros.livraria.get(i).getPags()+";"+Livros.livraria.get(i).getAnodepub());
                    for(int j=0; j<Livros.livraria.get(i).autores.size();j++){
                        bw.write(";"+Livros.livraria.get(i).autores.get(j));
                    }
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
   
    public void recup(String nomearq, Livraria Livros){
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
            Livros recuplivros = new Livros();
            recuplivros.setNome(line[0]);
            recuplivros.setIsbn(line[1]);
            recuplivros.setEditora(line[2]);
            recuplivros.setPags(Integer.parseInt(line[3]));
            recuplivros.setAnodepub(Integer.parseInt(line[4]));
            for(int i=5;i<line.length;i++){
            recuplivros.setAutores(line[i]);
        }
            Livros.livraria.add(recuplivros);
        }
        }
        catch(IOException e){
        System.out.println("Rolou não parsero, tenta de novo ai!");
    }
        
    }
}
//acabar de deixar os ponto e virgula na entrada e adicionar no case