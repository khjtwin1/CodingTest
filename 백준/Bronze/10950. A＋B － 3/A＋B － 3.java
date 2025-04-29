import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i = 1;
        for (; i<=T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}