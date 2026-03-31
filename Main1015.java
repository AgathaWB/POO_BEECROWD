import java.util.Scanner;

public class Main1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);
        imprimir(distancia);
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void imprimir(double distancia){
        System.out.printf("%.4f\n", distancia);
    }
}