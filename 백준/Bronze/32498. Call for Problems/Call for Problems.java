import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int i = 0; i<n; i++){
            int d = sc.nextInt();
            if(d%2==1)
                answer++;
        }
        System.out.println(answer);
    }
}