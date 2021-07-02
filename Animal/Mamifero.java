public class Mamifero extends Animal{
    private boolean pelo;
    private double peso;

    public void comunicar(){
        System.out.println("Rugidos");
    }
    public void movimentar(){
        System.out.println("Movimenta em 2 ou mais patas");
    }
    //pelo
    public boolean getPelo(){
        return this.pelo;
    }
    public void setPelo(boolean pelo){
        if (pelo == true)
        System.out.println("O animal possui varios pelos pelo corpo");
        else
        System.out.println("O animal não possui muitos pelos pelo corpo");
    }

    //peso
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }


    public Mamifero(String nomepop,String nomecient,float timelife, boolean selvagem,boolean extincao,String habitat,boolean pelo,double peso){
        super(nomepop,nomecient,timelife,selvagem,extincao,habitat);
        this.pelo=pelo;
        this.peso=peso;
    }

}
