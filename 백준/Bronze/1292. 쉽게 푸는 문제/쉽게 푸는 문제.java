import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        long sum = 0;
        int n = 0;
        for (int i = 1; n < B; i++) {
            for (int j = 0; j < i; j++) {
                n++;
                if(n>=A && n<=B)
                    sum += i;
                if(n == B)
                    break;
            }
        }
        System.out.println(sum);
    }
}