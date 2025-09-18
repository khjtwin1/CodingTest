import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int score = 1;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 0)
                score = 1;
            else {
                cnt += score;
                score++;
            }
        }
        System.out.println(cnt);
    }
}