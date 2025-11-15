import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        for(int i = 0; i<N; i++) {
            T -= sc.nextInt();
        }
        if(T<=0)
            System.out.println("Padaeng_i Happy");
        else System.out.println("Padaeng_i Cry");
    }
}