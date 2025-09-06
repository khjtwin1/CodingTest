import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int s = sc.nextInt();
        int left = (28 - (r * 8 + s * 3)) * (-1);
        System.out.println(left);
    }
}