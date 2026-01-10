import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int t = 0;
        int n = 5;
        while (L != 0) {
            if (L >= n) {
                t++;
                L -= n;
            } else {
                n--;
            }
        }
        System.out.println(t);
    }
}