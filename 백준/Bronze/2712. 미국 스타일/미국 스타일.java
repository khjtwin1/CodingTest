import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            double N = sc.nextDouble();
            String U = sc.next();
            if (U.equals("kg"))
                System.out.printf("%.4f lb%n", N * 2.2046);
            else if (U.equals("l"))
                System.out.printf("%.4f g%n", N * 0.2642);
            else if (U.equals("lb"))
                System.out.printf("%.4f kg%n", N * 0.4536);
            else
                System.out.printf("%.4f l%n", N * 3.7854);
        }
    }
}