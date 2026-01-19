import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        int K = sc.nextInt(), X = sc.nextInt();
        int answer = 0;
        for (int i = A; i <= B; i++) {
            if (Math.abs(K - i) <= X)
                answer++;
        }
        if (answer == 0) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(answer);
        }
    }
}