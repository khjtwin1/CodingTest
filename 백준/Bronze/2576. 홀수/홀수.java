import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int min = 100;
        for (int i = 0; i < 7; i++) {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                answer += n;
                if (min > n) {
                    min = n;
                }
            }

        }
        if (answer == 0 && min == 100) {
            System.out.println(-1);
        } else System.out.println(answer + "\n" + min);
    }
}