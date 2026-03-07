import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for (int A = 1; A <= 500; A++) {
            for (int B = 1; B <= A; B++) {
                if (A * A - B * B == N) cnt++;
            }
        }
        System.out.print(cnt);
    }
}
