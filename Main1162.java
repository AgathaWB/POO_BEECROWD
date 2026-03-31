import java.util.Scanner;

public class Main1162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nCasos = sc.nextInt();

        while (nCasos-- > 0) {
            int L = sc.nextInt(); // tamanho do trem
            int[] vagoes = new int[L];

            for (int i = 0; i < L; i++) {
                vagoes[i] = sc.nextInt();
            }

            int trocas = contarTrocas(vagoes);

            System.out.println("Optimal train swapping takes " + trocas + " swaps.");
        }
    }

    public static int contarTrocas(int[] v) {
        int trocas = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;

                    trocas++;
                }
            }
        }

        return trocas;
    }
}