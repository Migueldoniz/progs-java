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
public class Pessoa{
    private String nome;
    private int idade;
    private char sexo;
    private int faltas;
    private boolean ativo;

    //nome
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    //idade
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }

    //sexo
    public char getSexo(){
        return this.sexo;
    }
    public void setSexo(char sexo){
        this.sexo=sexo;
    }

    //faltas
    public int getFaltas(){
        return this.faltas;
    }
    public void setFaltas(int faltas){
        this.faltas=faltas;
    }

    //ativo
    public boolean getAtivo(){
        return this.ativo;
    }
    public void setAtivo(boolean ativo){
        this.ativo=ativo;

    }

    public Pessoa(String nome, int idade, char sexo, int faltas,boolean ativo){
        this.nome=nome;
        this.idade=idade;
        this.sexo=sexo;
        this.faltas=faltas;
        this.ativo=ativo;
    }
}
