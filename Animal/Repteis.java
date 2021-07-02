
public class Repteis extends Animal{
    private boolean patasorno;

    public void comunicar(){
        System.out.println("Barulhos diferentes");
    }
    public void movimentar(){
        if(getPatasorno()==true){
        System.out.println("Anda com 2 ou mais patas");
        }
        else{
            System.out.println("Se movimenta por meio de rastejo");
        }
    }
    public boolean getPatasorno(){
        return this.patasorno;
    }
    public void setPatasorno(boolean patasorno){
        if(patasorno == true)
        System.out.println("Esse animal possui patas");
        else
        System.out.println("Esse animal não possui patas");           
    }

    public Repteis(String nomepop,String nomecient,float timelife, boolean selvagem,boolean extincao,String habitat, boolean patasorno){
        super(nomepop,nomecient,timelife,selvagem,extincao,habitat);
        this.patasorno=patasorno;
    }
}
