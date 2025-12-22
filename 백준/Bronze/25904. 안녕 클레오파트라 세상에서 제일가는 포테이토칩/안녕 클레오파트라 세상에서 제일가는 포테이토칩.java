import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }

        int i = 0;
        while (true) {
            if (T[i] < X) {
                System.out.println(i + 1);
                return;
            } else {
                if (i == N - 1) {
                    i = -1;
                }
                i++;
                X++;
            }
        }
    }
}