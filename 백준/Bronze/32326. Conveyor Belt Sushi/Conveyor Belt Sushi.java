import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int cost = 3*R + 4*G + 5*B;
        System.out.println(cost);
    }
}