import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (6 - x > 0) {
            System.out.println("Oh My God!");
        } else {
            System.out.println("Success!");
        }
    }
}