import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HH = sc.nextInt();
        int MM = sc.nextInt();
        int answer = (HH-9)*60 + MM;
        System.out.println(answer);
    }
}