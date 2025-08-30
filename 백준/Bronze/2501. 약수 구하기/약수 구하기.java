import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                cnt++;
            }
        }
        if (cnt >= K) {
            int t = 0;
            int[] ms = new int[cnt];
            for (int i = 0; i < N; i++) {
                if (N % (i + 1) == 0) {
                    ms[t++] = (i + 1);
                }
            }
            System.out.println(ms[K - 1]);
        } else System.out.println(0);
    }
}