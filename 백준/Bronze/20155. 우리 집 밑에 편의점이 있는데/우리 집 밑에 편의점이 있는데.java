import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] cnt = new int[N];
        for(int i = 0; i<N; i++){
            int X = sc.nextInt();
            cnt[X-1]++;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<N; i++){
            if(max<cnt[i])
                max = cnt[i];
        }
        System.out.println(max);
    }
}