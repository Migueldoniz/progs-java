public class Principal {

	public static void main(String[] args) {
		Caminhao citroen = new Caminhao(1998,"Carga pesada","cinza","536874F7OE9",5000,1500);
		Caminhao johndier = new Caminhao(2004,"Carga leve","azul","5487965D9F7E",10000,5000);
		Caminhao cilada = new Caminhao(1990,"Carga pesada","cinza","eumaciladabino",2000,1500);
		
		System.out.println("Ano: "+citroen.getAno());
		System.out.println("Modelo: "+citroen.getModelo());
		System.out.println("Cor: "+citroen.getCor());
		System.out.println("Cód Chassi: "+citroen.getChassi());
		System.out.println("Cilindradas: "+citroen.getCilindradas());
		System.out.println("Potência: "+citroen.getPot()+"W");
		
		System.out.println("\n\n");
						
		System.out.println("Ano: "+johndier.getAno());
		System.out.println("Modelo: "+johndier.getModelo());
		System.out.println("Cor: "+johndier.getCor());
		System.out.println("Cód Chassi: "+johndier.getChassi());
		System.out.println("Cilindradas: "+johndier.getCilindradas());
		System.out.println("Potência: "+johndier.getPot()+"W");
		
		System.out.println("\n\n");
		
		System.out.println("Ano: "+cilada.getAno());
		System.out.println("Modelo: "+cilada.getModelo());
		System.out.println("Cor: "+cilada.getCor());
		System.out.println("Cód Chassi: "+cilada.getChassi());
		System.out.println("Cilindradas: "+cilada.getCilindradas());
		System.out.println("Potência: "+cilada.getPot()+"W");


	}

}
