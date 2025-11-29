import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i<N; i++){
            int j = i+1;
            while (j>0) {
                int k = j%10;
                if (k==3 || k==6 || k==9){
                    cnt++;
                }
                j/=10;
            }
        }
        System.out.println(cnt);
    }
}