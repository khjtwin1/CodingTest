import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int D = sc.nextInt();

            System.out.println(N * (2 * A + (N - 1) * D) / 2);
        }
    }
}