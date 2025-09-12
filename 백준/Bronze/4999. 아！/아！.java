import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String J = sc.next();
        String D = sc.next();
        if (J.length() >= D.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}