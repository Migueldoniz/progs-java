public class Motorista{
    private String nome;
    private String numerocnh;
    private String cidade;
    private String letra;
    private int validade;
    private boolean definitiva=false;

    //nome
	public String getnome(){
		return this.nome;
	}
    public void setnome(String nome){
        this.nome=nome;
    }
	

    //numerocnh
	public String getnumerocnh(){
		return this.numerocnh;
	}
    public void setnumerocnh(String numerocnh){
        this.numerocnh=numerocnh;
    }
	

    //cidade
	public String getcidade(){
		return this.cidade;
	}
    public void setcidade(String cidade){
        this.cidade=cidade;
    }

    //letra
    public String getletra(){
        return this.letra;
    }
    public void setletra(String letra){
        this.letra=letra;
    }

    //validade
    public int getvalidade(){
        return this.validade;
    }
    public void setvalidade(int validade){
        this.validade=validade;
    }

    //definitiva
    public boolean getdefinitiva(){
        return this.definitiva;
    }
    public void setdefinitiva(Boolean definitiva){
        this.definitiva=definitiva;
    }

    

    public Motorista(String nome , String cidade){
        this(nome, "0", cidade, "", 0, false);
    }

    public Motorista(String nome, String numerocnh, String cidade, String letra, int validade, boolean definitiva){
        this.nome=nome;
        this.numerocnh=numerocnh;
        this.cidade=cidade;
        this.letra=letra;
        this.validade=validade;
        this.definitiva=definitiva;
    }


    public void setDadosMotorista(String nome , String cidade){
        setnome(nome);
        setcidade(cidade);
    }
    public void setDadosMotorista(String nome, String numerocnh, String cidade, String letra, int validade, boolean definitiva){
        setnome(nome);
        setnumerocnh(numerocnh);
        setcidade(cidade);
        setletra(letra);
        setvalidade(validade);
        setdefinitiva(definitiva);
    }

    public static void main (String args[]){
        Motorista Jose,Mario;
        Jose=new Motorista("Jose Alfredo Bonini", "Sao Joaquim da Barra");
        Mario=new Motorista("Mario Quintana", "10123456789","Sao Jose do Rio Preto","D",2027,true);

        System.out.println("Nome: "+ Jose.getnome());
        System.out.println("Cidade: "+ Jose.getcidade());
        if(Jose.definitiva==true){
            System.out.println("Carta Definitiva");
        }
        else{
            System.out.println("Permissao para dirigir");
        }
        
        System.out.println("\n\n");

        System.out.println("Nome: "+ Mario.getnome());
        System.out.println("Numero CNH: "+ Mario.getnumerocnh());
        System.out.println("Cidade: "+ Mario.getcidade());
        System.out.println("Letra: "+ Mario.getletra());
        System.out.println("Ano de Vencimento: "+ Mario.getvalidade());
        if(Mario.definitiva==true){
            System.out.println("Carta Definitiva");
        }
        else{
            System.out.println("Permissao para dirigir");
        }

    }
}