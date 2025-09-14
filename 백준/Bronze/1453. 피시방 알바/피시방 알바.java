import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        boolean[] seats = new boolean[100];
        for (int i = 0; i < seats.length; i++) {
            seats[i] = true;
        }
        for (int i = 0; i < N; i++) {
            int want = sc.nextInt();
            if (seats[want - 1] == false) {
                cnt++;
            } else {
                seats[want - 1] = false;
            }
        }
        System.out.println(cnt);
    }
}