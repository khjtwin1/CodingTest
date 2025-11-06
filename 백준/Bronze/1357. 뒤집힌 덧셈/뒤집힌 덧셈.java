import java.util.Scanner;

public class Main {
    static int Rev(int n){
        int rev = 0;
        while (n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int answer = Rev(Rev(X)+Rev(Y));
        System.out.println(answer);
    }
}
