import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int korD;
        if (A % C == 0) {
            korD = A / C;
        } else {
            korD = A / C + 1;
        }

        int mathD;
        if (B % D == 0) {
            mathD = B / D;
        } else {
            mathD = B / D + 1;
        }
        if (korD > mathD) {
            System.out.println(L - korD);
        } else {
            System.out.println(L - mathD);
        }
    }
}