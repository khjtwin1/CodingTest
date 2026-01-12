import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while (true) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            System.out.println("Triangle #" + cnt++);
            if (a == -1) {
                if (c <= b) {
                    System.out.println("Impossible.");
                } else {
                    double result = Math.sqrt(c * c - b * b);
                    System.out.printf("a = %.3f%n", result);
                }
            } else if (b == -1) {
                if (c <= a) {
                    System.out.println("Impossible.");
                } else {
                    double result = Math.sqrt(c * c - a * a);
                    System.out.printf("b = %.3f%n", result);
                }
            } else if (c == -1) {
                double result = Math.sqrt(a * a + b * b);
                System.out.printf("c = %.3f%n", result);
            } else {
                System.out.println("Impossible.");
            }
            System.out.println();
        }
    }
}