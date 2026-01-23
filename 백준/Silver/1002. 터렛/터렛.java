import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt();
            int x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();
            double dis = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            if (dis == 0) {
                if (r1 == r2) {
                    System.out.println(-1);
                } else System.out.println(0);
            } else if (dis < r1 + r2) {
                if (dis < Math.abs(r1 - r2)) {
                    System.out.println(0);
                } else if (dis == Math.abs(r1 - r2)) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else if (dis == r1 + r2) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}