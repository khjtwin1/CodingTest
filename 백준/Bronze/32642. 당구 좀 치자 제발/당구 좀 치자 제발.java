import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long anger = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (sc.nextInt() == 1) anger++;
            else anger--;
            sum += anger;
        }
        System.out.println(sum);
    }
}
