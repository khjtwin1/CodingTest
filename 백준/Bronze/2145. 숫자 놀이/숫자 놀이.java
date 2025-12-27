import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            if (N == 0) {
                return;
            }
            while (N > 9) {
                String s = Integer.toString(N);
                int sum = 0;
                for (int i = 0; i < s.length(); i++) {
                    sum += s.charAt(i) - '0';
                }
                N = sum;
            }
            System.out.println(N);
        }
    }
}