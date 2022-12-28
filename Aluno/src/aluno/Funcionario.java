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
public class Funcionario extends Pessoa {
    private String cargo;

    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    
    public Funcionario (String nome, int idade,char sexo, int faltas,boolean ativo, String cargo){
        super(nome,idade,sexo,faltas,ativo);
        this.cargo=cargo;
    }
}
