import java.util.Scanner;
public class Calculo {
    public int soma (int a, int b){
        return a+b;
    }
    public double soma(double a, double b){
        return a+b;
    }
    public int sub (int a, int b){
        return a-b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public int mult (int a, int b){
        return a*b;
    }
    public double mult(double a, double b){
        return a*b;
    }
    public int div (int a, int b){
        return a/b;
    }
    public double div(double a, double b){
        return a/b;
    }
    public static void main(String args[]) {
        int op;
        double a,b;
        Scanner leitor = new Scanner(System.in);
        Calculo calc = new Calculo();
        System.out.println("Insira o numero correspondente a operacao desejada:\n1-Para soma\n2-Para Subtracao\n3-Para Multiplicacao\n4-Para Divisao: ");
        op=leitor.nextInt(); 
        switch (op){
            case 1:
            a=leitor.nextDouble();
            b=leitor.nextDouble();
            System.out.println("A soma dos dois é: "+calc.soma(a,b));
            break;

            case 2:
            a=leitor.nextDouble();
            b=leitor.nextDouble();
            System.out.println("A subtracao dos dois é: "+calc.sub(a,b));
            break;

            case 3:
            a=leitor.nextDouble();
            b=leitor.nextDouble();
            System.out.println("A multiplicacao dos dois é: "+calc.mult(a,b));
            break;

            case 4:
            a=leitor.nextDouble();
            b=leitor.nextDouble();
            System.out.println("A divisao dos dois é: "+calc.div(a,b));
            break;
        }
    }
}
