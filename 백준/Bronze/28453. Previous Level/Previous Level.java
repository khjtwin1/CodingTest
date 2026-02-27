import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            if (M == 300) {
                System.out.print(1 + " ");
            } else if (M >= 275) {
                System.out.print(2 + " ");
            } else if (M >= 250) {
                System.out.print(3 + " ");
            } else {
                System.out.print(4 + " ");
            }
        }
    }
}