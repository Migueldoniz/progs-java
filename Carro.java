
public class Carro
{
	private String nome;
	private String cor;
	private int ano;
	private float km;
	private float peso;
	private boolean used;
	private float valor;
	private String marca;
	

	//nome
	public String getnome(){
		return this.nome;
	}
	
	public void setnome(String nome){
		this.nome = nome;
	}
	
	//cor
	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	
	//ano
	public int getAno(){
		return this.ano;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	//Km
	public float getKm(){
		return this.km;
	}
	
	public void setKm(float km){
		this.km = km;
	}
	
	//peso
	public float getPeso(){
		return this.peso;
	}
	
	public void setPeso(float peso){
		this.peso = peso;
	}
	
	
	//valor
	public float getValor(){
		return this.valor;
	}
	public void setValor(float valor){
		this.valor = valor;
	}
	
	//marca
	public String getMarca(){
		return this.marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
		
    public boolean getUsed(){
        return this.used;
    }
    public void setUsed(Boolean used){
        this.used=used;
    }
	/*//usado
	public void setusado(float km){
		if(km>0)
			this.used = true;
		else
			this.used = false;
	}*/


    public Carro(String nome, String cor, float peso, float valor, String marca){
        this(nome, cor,2021,0,peso,false,valor,marca);

    }
	public Carro(String nome, String cor, int ano, float km, float peso, boolean used, float valor, String marca){
        this.nome=nome;
        this.cor=cor;
        this.ano=ano;
        this.km=km;
        this.peso=peso;
        this.used=used;
        this.valor=valor;
        this.marca=marca;
    }

	/*//marca
	public String setmarca(String nome){
		
		if(nome.equals("Uno Mille")){
			return ("Fiat");
			//break;
		}
			else if(nome.equals("Celta bola")){
			return ("Chevrolet");
			//break;
			}
			else if (nome.equals("Ford Fiesta")){
			return ("Ford");
			//break;
			}
			else
			return "Carro não encontrado!";
	}*/
	
	public void setDadosCarro(String nome, String cor, float peso, float valor, String marca){
        setnome(nome);
        setCor(cor);
        setPeso(peso);
        setValor(valor);
        setMarca(marca);
    }
    public void setDadosCarro(String nome, String cor, int ano, float km, float peso, boolean used, float valor, String marca){
        setnome(nome);
        setCor(cor);
        setAno(ano);
        setKm(km);
        setPeso(peso);
        setUsed(used);
        setValor(valor);
        setMarca(marca);
    }
	
	public static void main (String args[]){
		Carro uno = new Carro("Uno Mille","Preto",750,12000f,"Fiat");
		Carro celta = new Carro("Celta bola","Prata",800,17000f,"Chevrolet");
		Carro Fiesta = new Carro("Ford Fiesta","Vermelho",2020,400f,950f,true,25000f,"Ford");
		//uno
		System.out.println(uno.getnome());
		System.out.println(uno.getAno()+","+uno.getCor());
		//System.out.println(uno.getKm()+"KM");
		System.out.println("Zero KM");
		System.out.println(uno.getPeso()+"Kg");
		System.out.println("R$"+uno.getValor());
        System.out.println("Marca: "+uno.getMarca());
		
		System.out.println("\n\n");
		
		//celta
		System.out.println(celta.getnome());
		System.out.println(celta.getAno()+","+celta.getCor());
		//System.out.println(celta.getKm()+"KM");
		System.out.println("Zero KM");
		System.out.println(celta.getPeso()+"Kg");
		System.out.println("R$"+celta.getValor());
        System.out.println("Marca: "+celta.getMarca());
		
		System.out.println("\n\n");
		
		//Fiesta
		System.out.println(Fiesta.getnome());
		System.out.println(Fiesta.getAno()+","+Fiesta.getCor());
		System.out.println(Fiesta.getKm()+"KM");
		System.out.println("Usado");
		System.out.println(Fiesta.getPeso()+"Kg");
		System.out.println("R$"+Fiesta.getValor());
        System.out.println("Marca: "+Fiesta.getMarca());
		
	}
	
}


