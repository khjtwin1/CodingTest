import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] answer = new int[10];
        for(int i = 1; i<=answer.length; i++){
            answer[i-1] = (i-1)%5+1;
        }
        for(int i = 0; i<N; i++){
            int right = 0;
            for(int j = 0; j<10; j++){
                if(sc.nextInt()==answer[j])
                    right++;
            }
            if(right==10)
                System.out.println(i+1);
        }
    }
}