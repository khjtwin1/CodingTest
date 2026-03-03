import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int answer = 0;
            int I = sc.nextInt();
            for (int j = 1; j <= I; j++) {
                answer += Math.pow(j, 2);
            }
            System.out.println(answer);
        }
    }
}