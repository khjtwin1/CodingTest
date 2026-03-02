import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] m = {25, 10, 5, 1};
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            for (int j = 0; j < 4; j++) {
                System.out.print(C / m[j] + " ");
                C %= m[j];
            }
            System.out.println();
        }
    }
}