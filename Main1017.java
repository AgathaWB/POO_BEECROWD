import java.util.Scanner;

public class Main1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();

        double litros = calcularLitros(tempo, velocidade);
        imprimir(litros);
    }

    public static double calcularLitros(int tempo, int velocidade){
        return (tempo * velocidade) / 12.0;
    }

    public static void imprimir(double litros){
        System.out.printf("%.3f\n", litros);
    }
}