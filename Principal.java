
public class Principal {

	public static void main(String[] args) {
		Ventilador Britania = new Ventilador("Britania",3,6,5000);
		System.out.println("Modelo: "+Britania.getModelo());
		System.out.println("N° de série: "+Britania.getNumeroserie());
		System.out.println("Quantidade de pás: "+Britania.getQuantpa());
		System.out.println("Potência: "+Britania.getPot()+"W");

	}

}
