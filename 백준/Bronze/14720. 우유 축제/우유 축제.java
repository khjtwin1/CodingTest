import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0, next = 0;

        for (int i = 0; i < N; i++) {
            int milk = sc.nextInt();
            if (milk == next) {
                answer++;
                next = (next + 1) % 3;
            }
        }
        System.out.println(answer);
    }
}