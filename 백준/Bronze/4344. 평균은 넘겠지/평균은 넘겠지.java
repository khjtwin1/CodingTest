import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for(int i = 0; i<C; i++){
            int N = sc.nextInt();
            double average = 0;
            int[] stu = new int[N];
            for(int j = 0; j<N; j++){
                stu[j] = sc.nextInt();
                average += stu[j];
            }
            average /= N;
            double cnt = 0;
            for(int j = 0; j<N; j++){
                if(stu[j]>average)
                    cnt++;
            }
            double ratio = cnt*100/N;
            System.out.printf("%.3f%%\n", ratio);
        }
    }
}