import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        int answer = 1;
        int block = num[num.length - 1];
        for (int i = num.length - 2; i >= 0; i--) {
            if (num[i] > block) {
                answer++;
                block = num[i];
            }
        }
        System.out.println(answer);
    }
}