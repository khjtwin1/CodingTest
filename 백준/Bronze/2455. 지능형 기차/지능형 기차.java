import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        int Max = 0;
        for (int i = 0; i < 4; i++) {
            p -= sc.nextInt();
            p += sc.nextInt();
            if (p > Max)
                Max = p;
        }
        System.out.println(Max);
    }
}