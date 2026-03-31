import java.util.Scanner;

public class Main1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nFuncionario = sc.nextInt();
        int horaTrabalhadas = sc.nextInt();
        double valorHoras = sc.nextDouble();

        double salarioFinal = calcularSalario(horaTrabalhadas, valorHoras);
        imprimir(salarioFinal, nFuncionario);
    }

    public static double calcularSalario(int horaTrabalhadas, double valorHoras){
        return horaTrabalhadas * valorHoras;
    }

    public static void imprimir(double salarioFinal, int nFuncionario){
        System.out.println("NUMBER = " + nFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salarioFinal);
    }
}