import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "WelcomeToSMUPC";
        int N = sc.nextInt();
        System.out.println(s.charAt((N - 1) % 14));
    }
}