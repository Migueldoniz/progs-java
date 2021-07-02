public class Aves extends Animal{
    private boolean voaorno;
    
    public void comunicar(){
        System.out.println("Piados");
    }
    public void movimentar(){
        System.out.println("Voa com asas");
    }
    public boolean getVoarorNo(){
        return this.voaorno;
    }
    public void setVoarorNo(boolean voarorno){
        if (voarorno == true)
        System.out.println ("Essa ave voa");
        else
        System.out.println("Essa ave não voa");
    }
    
    public Aves(String nomepop,String nomecient,float timelife, boolean selvagem,boolean extincao,String habitat,boolean voarorno){
        super(nomepop,nomecient,timelife,selvagem,extincao,habitat);
        this.voaorno=voarorno;
    }
}
