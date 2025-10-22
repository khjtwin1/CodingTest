import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double W = sc.nextInt();
        double H = sc.nextInt();
        System.out.printf("%.1f", W*H/2);
    }
}