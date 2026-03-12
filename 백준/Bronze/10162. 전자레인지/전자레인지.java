import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] answer = {0, 0, 0};
        int[] btn = {300, 60, 10};
        for (int i = 0; i < btn.length; i++) {
            if (T >= btn[i]) {
                answer[i] = T / btn[i];
                T %= btn[i];
            }
        }
        if (T == 0) {
            for (int a : answer) {
                System.out.print(a + " ");
            }
        } else {
            System.out.println(-1);
        }
    }
}