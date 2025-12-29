import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int rcnt = 0, ccnt = 0;
        char[][] castle = new char[N][M];
        for (int i = 0; i < N; i++) {
            String bg = sc.next();
            for (int j = 0; j < M; j++) {
                castle[i][j] = bg.charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {
            boolean f = false;
            for (int j = 0; j < M; j++) {
                if (castle[i][j] == 'X') {
                    f = true;
                    break;
                }
            }
            if (!f) {
                rcnt++;
            }
        }
        for (int j = 0; j < M; j++) {
            boolean f = false;
            for (int i = 0; i < N; i++) {
                if (castle[i][j] == 'X') {
                    f = true;
                    break;
                }
            }
            if (!f) {
                ccnt++;
            }
        }
        System.out.println(Math.max(rcnt, ccnt));
    }
}