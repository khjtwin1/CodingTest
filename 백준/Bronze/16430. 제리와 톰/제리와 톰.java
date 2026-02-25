import java.util.Scanner;

public class Main {

    static int giyak(int a, int b) {
        while (b != 0) {
            int n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int taken = B - A;
        int c = B;
        int g = giyak(taken, c);
        System.out.println(taken / g + " " + c / g);
    }
}