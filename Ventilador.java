public class Ventilador implements Modelo,Potencia,Qtdpa{
	private String model;
	private int numberserie;
	private int quantpa;
	private double potencia;
	
	public Ventilador(String model, int numberserie,int quantpa, double potencia) {
		setModelo(model);
		setNumeroserie(numberserie);
		setQuantpa(quantpa);
		setPot(potencia);
		
	}
	public double getPot() {
		return potencia;
	}
	public void setPot(double potencia) {
		this.potencia=potencia;
	} 
	
	public int getQuantpa() {
		return quantpa;
	}
	public void setQuantpa(int quantpa) {
		this.quantpa=quantpa;
	}
	
	public String getModelo() {
		return model;
	}
	public void setModelo(String model) {
		this.model=model;
	}

	public int getNumeroserie() {
		return numberserie;
	}
	public void setNumeroserie(int numberserie) {
		this.numberserie=numberserie;
	}
}
