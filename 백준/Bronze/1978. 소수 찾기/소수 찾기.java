import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            if (n != 1) {
                int prime = 0;
                for (int j = 2; j < n; j++) {
                    if (n % j == 0) {
                        prime++;
                    }
                }
                if (prime == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}