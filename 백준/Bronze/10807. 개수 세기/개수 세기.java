import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int[size];
        int cnt = 0;
        for (int i = 0; i<n.length; i++) {
            n[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        for (int i = 0; i<n.length; i++){
            if (n[i]==num)
                cnt++;
        }
        System.out.println(cnt);
    }
}