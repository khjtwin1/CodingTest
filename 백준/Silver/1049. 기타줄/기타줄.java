import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int pMin = sc.nextInt(), eachMin = sc.nextInt();
        for (int i = 1; i < M; i++) {
            pMin = Math.min(pMin, sc.nextInt());
            eachMin = Math.min(eachMin, sc.nextInt());
        }
        int answer = Math.min(N * eachMin, Math.min((N + 5) / 6 * pMin, N / 6 * pMin + N % 6 * eachMin));
        System.out.println(answer);
    }
}