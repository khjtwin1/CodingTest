import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] chess = new char[8][8];
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            String pieces = sc.next();
            for (int j = 0; j < 8; j++) {
                chess[i][j] = pieces.charAt(j);
                if (i % 2 == 1 && j % 2 == 1 && chess[i][j] == 'F')
                    cnt++;
                else if (i % 2 == 0 && j % 2 == 0 && chess[i][j] == 'F')
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}