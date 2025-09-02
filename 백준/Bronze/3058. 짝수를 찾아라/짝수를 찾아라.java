import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int sum = 0;
            int min = 100;
            for (int j = 0; j < 7; j++) {
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    sum += n;
                    if (n < min) {
                        min = n;
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}