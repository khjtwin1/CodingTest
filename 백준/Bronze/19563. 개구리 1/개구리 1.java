import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(Math.abs(a)+Math.abs(b) <= c && (c-Math.abs(a)+Math.abs(b))%2==0){
            System.out.println("YES");
        } else System.out.println("NO");
    }
}