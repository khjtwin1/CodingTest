import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];
        for(int i = 0; i<5; i++){
            A[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<5; i++){
            sum += A[i];
        }
        System.out.println(sum);
    }
}