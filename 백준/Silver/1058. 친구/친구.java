import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next().toCharArray();
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            boolean[] twoF = new boolean[N];
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (arr[i][j] == 'Y') twoF[j] = true;
                else {
                    for (int k = 0; k < N; k++) {
                        if (arr[i][k] == 'Y' && arr[k][j] == 'Y') {
                            twoF[j] = true;
                            break;
                        }
                    }
                }
            }
            int cnt = 0;
            for (boolean b : twoF) if (b) cnt++;
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }
}