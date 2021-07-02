
public abstract class Animal {
    private String nomepop;
    private String nomecient;
    private float timelife;
    private boolean selvagem;
    private boolean extincao;
    private String habitat;

    public abstract void comunicar();
    public abstract void movimentar();
    //nome popular
    public String getNomePop(){
        return this.nomepop;
    }
    public void setNomePop(String nomepop){
        this.nomepop=nomepop;
    }

    //nome cientifico
    public String getNomeCient(){
        return this.nomecient;
    }
    public void setNomeCient(String nomecient){
        this.nomecient=nomecient;
    }

    //timelife
    public float getTimeLife(){
        return this.timelife;
    }
    public void setTimeLife(float timelife){
        this.timelife=timelife;
    }

    //selvagem
    public boolean getSelvagem(){
        return this.selvagem;
    } 
    public void setSelvagem(Boolean selvagem){
        if(selvagem == true)
         System.out.println("Selvagem");
         else
         System.out.println("Domestico");
    }

    //extinção
    public boolean getExtincao(){
        return this.extincao;
    } 
    public void setExtincao(Boolean extincao){
        if(extincao == true)
        System.out.println("em Extincao");
        else
        System.out.println("fora de Extincao");
    }

    //habitat
    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String habitat){
        this.habitat=habitat;
    }

    public Animal(String nomepop,String nomecient,float timelife, boolean selvagem,boolean extincao,String habitat){
        this.nomepop=nomepop;
        this.nomecient=nomecient;
        this.timelife=timelife;
        this.selvagem=selvagem;
        this.extincao=extincao;
        this.habitat=habitat;   
    }


}
