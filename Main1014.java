import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int distanciaTotal = sc.nextInt();
         double combostivelGasto = sc.nextDouble();

         double media = calcularMedia(distanciaTotal, combostivelGasto);
         imprimir(media);

    }
    public static double calcularMedia(int distanciaTotal, double combostivelGasto){
        return distanciaTotal/combostivelGasto;
    }
    public static void imprimir(double media){
        System.out.printf("%.3f km/l\n", media);
    }
}
