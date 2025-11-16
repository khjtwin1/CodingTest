import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        int sum = 0;
        for(int i = 0; i<5; i++){
            n[i] = sc.nextInt();
            sum += n[i];
        }
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(n[j]>n[j+1]){
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }
        System.out.println(sum/5);
        System.out.println(n[2]);
    }
}