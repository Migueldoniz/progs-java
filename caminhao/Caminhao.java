public class Caminhao implements Carroceria,Motor{
	private int ano;
	private String modelo;
	private String cor;
	private String chassi;
	private int cilindradas;
	private int pot;
	
	public Caminhao(int ano, String modelo, String cor, String chassi, int cilindradas, int pot) {
		setAno(ano);
		setModelo(modelo);
		setCor(cor);
		setChassi(chassi);
		setCilindradas(cilindradas);
		setPot(pot);
	}
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	public int getPot() {
		return pot;
	}
	public void setPot(int pot) {
		this.pot = pot;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
