public class Principal {
    public static void main(String args[]){
        Mamifero Macaco = new Mamifero("Macaco-Prego-Galego","Cebus flavius",35,true,true,"na Mata Atlantica",true,2.0f);
        Mamifero Humano = new Mamifero("Humano","Homo Sapiens Sapiens",79,false,false,"no meio Terrestre, por enquanto",true,65.0f);
        Aves Pinguim = new Aves("Pinguim-imperador","Aptenodytes forsteri",20,true,false,"na Antartica",false);
        Aves Jaodebarro = new Aves("João de Barro","Furnarius rufus",3,true,false,"na Casinha dele em Arvores",true);
        Repteis Cobra = new Repteis("Jararaca-da-mata","Bothrops jararaca",10,true,true,"na Mata Atlantica e Cerrado",false);
        Repteis Tartaruga = new Repteis("Tartaruga","Testudines",55,false,true,"em Mar e oceanos",true);
        
        System.out.println("\tMamiferos:");
        System.out.println("Nome popular: "+Macaco.getNomePop());
        System.out.println("Nome cientifico: "+Macaco.getNomeCient());
        System.out.println("Expectativa de vida: "+Macaco.getTimeLife()+" anos");
        System.out.print("Este animal e: ");
        Macaco.setSelvagem(Macaco.getSelvagem());
        System.out.print("Este animal esta ");
        Macaco.setExtincao(Macaco.getExtincao());
        System.out.println("Normalmente e encontrado "+Macaco.getHabitat());
        Macaco.setPelo(Macaco.getPelo());
        System.out.println("Seu peso medio e "+Macaco.getPeso()+"kg");
        Macaco.comunicar();
        Macaco.movimentar();
        if (Macaco instanceof Mamifero){
            System.out.println("Sou da classe dos mamiferos");
        }

        System.out.println("\n\n");

        System.out.println("Nome popular: "+Humano.getNomePop());
        System.out.println("Nome cientifico: "+Humano.getNomeCient());
        System.out.println("Expectativa de vida: "+Humano.getTimeLife()+" anos");
        System.out.print("Este animal e ");
        Humano.setSelvagem(Humano.getSelvagem());
        System.out.print("Este animal esta ");
        Humano.setExtincao(Humano.getExtincao());
        System.out.println("Normalmente e encontrado "+Humano.getHabitat());
        Humano.setPelo(Humano.getPelo());
        System.out.println("Seu peso medio e "+Humano.getPeso()+"kg");
        Humano.comunicar();
        Humano.movimentar();
        if (Humano instanceof Mamifero){
            System.out.println("Sou da classe dos mamiferos");
        }


        System.out.println("\n\n");

        System.out.println("\tAves:");
        System.out.println("Nome popular: "+Pinguim.getNomePop());
        System.out.println("Nome cientifico: "+Pinguim.getNomeCient());
        System.out.println("Expectativa de vida: "+Pinguim.getTimeLife()+" anos");
        System.out.print("Este animal e: ");
        Pinguim.setSelvagem(Pinguim.getSelvagem());
        System.out.print("Este animal esta ");
        Pinguim.setExtincao(Pinguim.getExtincao());
        System.out.println("Normalmente e encontrado "+Pinguim.getHabitat());
        Pinguim.setVoarorNo(Pinguim.getVoarorNo());
        Pinguim.comunicar();
        Pinguim.movimentar();
        if(Pinguim instanceof Aves){
                System.out.println("Sou da classe das aves");
            }


        System.out.println("\n\n");

        System.out.println("Nome popular: "+Jaodebarro.getNomePop());
        System.out.println("Nome cientifico: "+Jaodebarro.getNomeCient());
        System.out.println("Expectativa de vida: "+Jaodebarro.getTimeLife()+" anos");
        System.out.print("Este animal e: ");
        Jaodebarro.setSelvagem(Jaodebarro.getSelvagem());
        System.out.print("Este animal esta ");
        Jaodebarro.setExtincao(Jaodebarro.getExtincao());
        System.out.println("Normalmente e encontrado "+Jaodebarro.getHabitat());
        Jaodebarro.setVoarorNo(Jaodebarro.getVoarorNo());
        Jaodebarro.comunicar();
        Jaodebarro.movimentar();
        if(Jaodebarro instanceof Aves){
                System.out.println("Sou da classe das aves");
            }


        System.out.println("\n\n");

        System.out.println("\tRepteis:");
        System.out.println("Nome popular: "+Cobra.getNomePop());
        System.out.println("Nome cientifico: "+Cobra.getNomeCient());
        System.out.println("Expectativa de vida: "+Cobra.getTimeLife()+" anos");
        System.out.print("Este animal e: ");
        Cobra.setSelvagem(Cobra.getSelvagem());
        System.out.print("Este animal esta ");
        Cobra.setExtincao(Cobra.getExtincao());
        System.out.println("Normalmente e encontrado "+Cobra.getHabitat());
        Cobra.setPatasorno(Cobra.getPatasorno());
        Cobra.comunicar();
        Cobra.movimentar();
        if (Cobra instanceof Repteis){
            System.out.println("Sou da classe dos repteis");
        }


        System.out.println("\n\n");

        System.out.println("Nome popular: "+Tartaruga.getNomePop());
        System.out.println("Nome cientifico: "+Tartaruga.getNomeCient());
        System.out.println("Expectativa de vida: "+Tartaruga.getTimeLife()+" anos");
        System.out.print("Este animal e: ");
        Tartaruga.setSelvagem(Tartaruga.getSelvagem());
        System.out.print("Este animal esta ");
        Tartaruga.setExtincao(Tartaruga.getExtincao());
        System.out.println("Normalmente e encontrado "+Tartaruga.getHabitat());
        Tartaruga.setPatasorno(Tartaruga.getPatasorno());
        Tartaruga.comunicar();
        Tartaruga.movimentar();
        if (Tartaruga instanceof Repteis){
            System.out.println("Sou da classe dos repteis");
        }



    }  
}
