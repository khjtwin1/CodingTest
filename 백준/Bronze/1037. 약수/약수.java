import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] divisor = new int[N];
        for (int i = 0; i < N; i++) {
            divisor[i] = sc.nextInt();
        }
        if (N == 1) {
            System.out.println(divisor[0] * divisor[0]);
            return;
        }
        int Max = 0;
        int min = 1000000;
        for (int i = 0; i < N; i++) {
            if (divisor[i] > Max)
                Max = divisor[i];
            if (divisor[i] < min) {
                min = divisor[i];
            }
        }
        System.out.println(Max * min);
    }
}