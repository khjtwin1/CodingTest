import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[10];
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int mul = A * B * C;
        String str = Integer.toString(mul);

        for (int i = 0; i < str.length(); i++) {
            int Int = str.charAt(i) - '0';
            cnt[Int]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(cnt[i]);
        }
    }
}