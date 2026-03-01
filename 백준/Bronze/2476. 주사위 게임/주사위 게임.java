import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        for (int i = 0; i < N; i++) {
            int money;
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (a == b && b == c) {
                money = 10000 + a * 1000;
            } else if (a == b || a == c) {
                money = 1000 + a * 100;
            } else if (b == c) {
                money = 1000 + b * 100;
            } else {
                money = Math.max(a, Math.max(b, c)) * 100;
            }
            if (money > max) {
                max = money;
            }
        }
        System.out.println(max);
    }
}