import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] list = {{1}, {2, 4, 8, 6}, {3, 9, 7, 1}, {4, 6}, {5}, {6}, {7, 9, 3, 1}, {8, 4, 2, 6}, {9, 1}};
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a%=10;
            if(a==0){
                System.out.println(10);
            }
            else{
                System.out.println(list[a - 1][(b - 1) % list[a - 1].length]);
            }
        }
    }
}