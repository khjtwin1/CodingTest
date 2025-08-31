import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int Max = 0;
        int iL = 0, jL = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > Max) {
                    Max = arr[i][j];
                    iL = i;
                    jL = j;
                }
            }
        }
        System.out.println(Max + "\n" + (iL + 1) + " " + (jL + 1));
    }
}