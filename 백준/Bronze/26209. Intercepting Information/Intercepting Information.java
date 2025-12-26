import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            int N = sc.nextInt();
            if (N != 0 && N != 1) {
                System.out.println("F");
                return;
            }
        }
        System.out.println("S");
    }
}