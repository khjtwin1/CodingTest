import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = 1 * sc.nextInt();
        int M = 2 * sc.nextInt();
        int L = 3 * sc.nextInt();
        String answer = S + M + L >= 10 ? "happy" : "sad";
        System.out.println(answer);
    }
}