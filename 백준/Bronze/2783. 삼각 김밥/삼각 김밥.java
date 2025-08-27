import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x25 = sc.nextInt();
        double y25 = sc.nextInt();
        double Min = x25 / y25 * 1000;
        double N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double x = sc.nextInt();
            double y = sc.nextInt();
            double per = x / y * 1000;
            if (per < Min)
                Min = per;
        }
        System.out.println(Min);
    }
}