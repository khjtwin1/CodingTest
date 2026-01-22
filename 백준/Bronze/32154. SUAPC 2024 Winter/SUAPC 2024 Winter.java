import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                {1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1}};

        int N = sc.nextInt() - 1;
        int cnt = 0;
        for (int i = 0; i < arr[N].length; i++) {
            if (arr[N][i] == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
        for (int i = 0; i < arr[N].length; i++) {
            if (arr[N][i] == 1) {
                System.out.print((char) ('A' + i) + " ");
            }
        }
    }
}