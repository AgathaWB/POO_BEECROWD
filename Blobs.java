import java.util.Scanner;

public class Blobs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double comida = sc.nextDouble();
            int dias = 0;

            while (comida > 1) {
                comida /= 2;
                dias++;
            }

            System.out.println(dias + " dias");
        }

        sc.close();
    }
}