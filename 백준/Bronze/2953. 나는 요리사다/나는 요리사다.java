import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[5][4];
        int[] total = new int[5];
        int maxN = 0, max = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                score[i][j] = sc.nextInt();
                total[i] += score[i][j];
            }
            if (total[i] > max) {
                maxN = i;
                max = total[i];
            }
        }
        System.out.println(maxN + 1 + " " + max);
    }
}