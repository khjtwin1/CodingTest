import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if (M < 45) {
            if (H == 0) {
                H = H + 24 - 1;
            } else {
                H -= 1;
            }
            M = 60 - 45 + M;
        } else {
            M -= 45;
        }
        System.out.print(H + " " + M);
    }
}