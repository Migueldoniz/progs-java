import java.util.Scanner;
public class Atendimento2 
{
    private static int cont=0;
    
    public int getCont() 
    {
        return this.cont;
    }
    public void setCont(int cont) 
    {
        this.cont = cont;
    }
    public int proximaPessoa(int cont)
    {
        setCont(cont+1);
        return cont+1;
    }    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Atendimento2 caixa = new Atendimento2();

        int op=-1;
        while(op!=0)
        {
            System.out.println("\n-----Gerenciamento dos Caixas-----");
            System.out.println("1- Chama próximo cliente no Caixa");
            System.out.println("2- Chama próximo cliente no Caixa");
            System.out.println("3- Chama próximo cliente no Caixa");
            System.out.println("4- Chama próximo cliente no Caixa");
            System.out.println("5- Chama próximo cliente no Caixa");
            System.out.println("6- Mostra o estado de todos os caixas");
            System.out.println("0- Fecha o sistema do banco");
            System.out.printf("Opção: ");
            op = sc.nextInt();      
            switch(op)
            {
                case 1:
                {
                    caixa.proximaPessoa(caixa.getCont());
                    System.out.println("CAIXA 1) Senha atual: " + caixa.getCont());
                }break;
                case 2:
                {
                    caixa.proximaPessoa(caixa.getCont());
                    System.out.println("CAIXA 2) Senha atual: " + caixa.getCont());
                }break;
                case 3:
                {
                    caixa.proximaPessoa(caixa.getCont());
                    System.out.println("CAIXA 3) Senha atual: " + caixa.getCont());
                }break;
                case 4:
                {
                    caixa.proximaPessoa(caixa.getCont());
                    System.out.println("CAIXA 4) Senha atual: " + caixa.getCont());
                }break;                    
                case 5:
                {
                    caixa.proximaPessoa(caixa.getCont());
                    System.out.println("CAIXA 5) Senha atual: " + caixa.getCont());
                }break;     
                case 6:
                {
                    System.out.println("\n-----Mostrando Caixas-----");
                    for(int i=0; i<5; i++)
                    {
                        System.out.println("Estado Caixa " + (i+1) + ": " + caixa.getCont());
                    }
                }break;
                case 0:
                {
                    System.out.println("Fechando o sistema do banco...");
                }break;
                default: System.out.println("Caixa inválido!!!"); break;
            }            
        }
    }
}