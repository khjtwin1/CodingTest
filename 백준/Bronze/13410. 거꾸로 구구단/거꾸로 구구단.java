import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int answer = Integer.MIN_VALUE;
        for(int i = 1; i<=K; i++){
            String mul = Integer.toString(N*i);
            String usd = "";
            for(int j = mul.length()-1; j>=0; j--){
                usd += mul.charAt(j);
            }
            if(answer<Integer.parseInt(usd))
                answer = Integer.parseInt(usd);
        }
        System.out.println(answer);
    }
}