import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        int start = 10;
        while (true){
            if(N>start){
                N = Math.round(N/start)*start;
                start*=10;
            } else break;
        }
        System.out.println((int)N);
    }
}