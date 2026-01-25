import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] vote = new int[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x != 0) {
                vote[x - 1]++;
            }
        }
        int max = 0;
        int p = -1;
        boolean duplicated = false;
        for (int i = 0; i < N; i++) {
            if (vote[i] > max) {
                max = vote[i];
                p = i;
                duplicated = false;
            } else if (vote[i] == max && max != 0) {
                duplicated = true;
            }
        }
        if (duplicated || max == 0) {
            System.out.println("skipped");
        } else {
            System.out.println(p + 1);
        }
    }
}