import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C1 = (int)(N * 0.78);
        int C2 = (int)(N * 0.80 + N * 0.20 * 0.78);
        System.out.println(C1 + " " + C2);
    }
}