import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int cnt = 0;
        int min = 100000;
        for (int i = 1; i < N; i++) {
            if (i * i >= M && i * i <= N) {
                cnt += i * i;
                if (i * i < min)
                    min = i * i;
            }
        }
        if (cnt > 0)
            System.out.println(cnt + "\n" + min);
        else
            System.out.println(-1);
    }
}