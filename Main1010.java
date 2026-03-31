import java.util.Scanner;

public class Main1010 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int codigo1 = sc.nextInt();
         int nPecas1 = sc.nextInt();
         double valorUni1 = sc.nextDouble();
         int codigo2 = sc.nextInt();
         int nPecas2 = sc.nextInt();
         double valorUni2 = sc.nextDouble();

         double valorFinal = calcularvalor(nPecas1, valorUni1, nPecas2, valorUni2);
         imprimir(valorFinal);
    }
    public static double calcularvalor(int nPecas1, double valorUni1, int nPecas2, double valorUni2){
        return (nPecas1 * valorUni1) + (nPecas2 * valorUni2);
    }
    public static void imprimir(double valorFinal){
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorFinal);
    }
}
