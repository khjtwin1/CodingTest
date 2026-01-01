import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cnt = new int[N];
        int M = sc.nextInt();
        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int b = i - 1; b < j; b++) {
                cnt[b] = k;
            }
        }
        for (int b = 0; b < N; b++) {
            System.out.print(cnt[b] + " ");
        }
    }
}