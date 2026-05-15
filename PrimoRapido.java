import java.util.Scanner;

    public class PrimoRapido {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            long x = sc.nextLong();
            boolean primo = true;

            if (x == 1) {
                primo = false;
            } else {

                for (long j = 2; j * j <= x; j++) {

                    if (x % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}

