import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = 0;
        int cnt = 0;
        for (int i = 1; i <= 9; i++) {
            int n = sc.nextInt();
            if (n > Max) {
                Max = n;
                cnt = i;
            }
        }
        System.out.println(Max);
        System.out.println(cnt);
    }
}