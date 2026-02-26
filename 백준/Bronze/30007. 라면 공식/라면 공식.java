import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ramen = new int[N][3];
        for (int i = 0; i < N; i++) {
            ramen[i][0] = sc.nextInt();
            ramen[i][1] = sc.nextInt();
            ramen[i][2] = sc.nextInt();
            
            int W = ramen[i][0] * (ramen[i][2] - 1) + ramen[i][1];
            System.out.println(W);
        }
    }
}