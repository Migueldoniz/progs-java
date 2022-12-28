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
public class Professor extends Pessoa {
    private String materia;
    private int horaaula;

    public String getMateria(){
        return this.materia;
    }
    public void setMateria (String materia){
        this.materia=materia;
    }

    public int getHoraAula(){
        return this.horaaula;
    }
    public void setHoraAula (int horaaula){
        this.horaaula=horaaula;
    }

    public Professor(){
        this("",0,'C',0,true,"",0);
    }
    public Professor(String nome, int idade,char sexo, int faltas,boolean ativo,String materia,int horaaula){
        super(nome,idade,sexo,faltas,ativo);
        this.materia=materia;
        this.horaaula=horaaula;
    }
}
