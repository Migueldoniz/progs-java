//package Banco;
import java.util.Scanner;

public class Fila {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    Atendimento pessoa1 = new Atendimento();
    Atendimento pessoa2 = new Atendimento();
    Atendimento pessoa3 = new Atendimento();
    Atendimento pessoa4 = new Atendimento();
    Atendimento pessoa5 = new Atendimento();
    
    pessoa1.setCont(+1);
    System.out.println("Caixa 1\n senha: "+pessoa1.getCont());
    pessoa2.setCont(+1);
    System.out.println("\n\nCaixa 2\n senha "+pessoa2.getCont());
    pessoa3.setCont(+1);
    System.out.println("\n\nCaixa 3\n senha "+pessoa3.getCont());
    pessoa4.setCont(+1);
    System.out.println("\n\nCaixa 4\n senha "+pessoa4.getCont());
    pessoa5.setCont(+1);
    System.out.println("\n\nCaixa 5\n senha "+pessoa5.getCont());
    }
}
