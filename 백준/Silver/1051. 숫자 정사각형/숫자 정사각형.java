import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        sc.nextLine();
        int[][] square = new int[N][M];
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < M; j++) {
                square[i][j] = s.charAt(j) - '0';
            }
        }
        int max = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M - 1; j++) {
                for (int k = j + 1; k < M; k++) {
                    int diff = k - j;
                    if (i + diff >= N) continue;
                    int n = square[i][j];
                    if (n == square[i][k] && n == square[i + diff][j] && n == square[i + diff][k]) {
                        int size = diff + 1;
                        max = Math.max(max, size * size);
                    }
                }
            }
        }
        System.out.println(max);
    }
}