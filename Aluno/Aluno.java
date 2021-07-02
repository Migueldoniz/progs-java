import java.security.Principal;

public class Aluno extends Pessoa{
    private double media;

    //media
    public double getMedia(){
        return this.media;
    }
    public void setMedia(double media){
        this.media=media;
    }

    public Aluno (){
        this("",0,'C',0,true,0);
    }
    public Aluno(String nome, int idade,char sexo, int faltas,boolean ativo, double media){
        super(nome,idade,sexo,faltas,ativo);
        this.media=media;
    }
}
