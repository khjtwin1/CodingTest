import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int able = 0;
        for(int i = 0; i<K; i++){
            int A = sc.nextInt();
            able += A/2 + A%2;
        }
        if(N<=able){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}