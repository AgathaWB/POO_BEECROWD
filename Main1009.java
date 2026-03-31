import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         String nome = sc.nextLine();
         double salario = sc.nextDouble();
         double totalVendas = sc.nextDouble();

         double salarioFinal = calcularSalario(salario, totalVendas);
         imprimir(salarioFinal);
    }

    public static double calcularSalario(double salario, double totalVendas){
        double comissao = 15.0;
        return salario + (totalVendas * (comissao / 100));
    }

    public static void imprimir(double salarioFinal){
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);
    }
}