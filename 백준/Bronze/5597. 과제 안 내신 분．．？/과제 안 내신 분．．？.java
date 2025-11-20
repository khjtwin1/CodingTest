import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[] stu = new boolean[30];
        for(int i = 0; i<28; i++){
            int n = sc.nextInt();
            stu[n-1] = true;
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i<stu.length; i++){
            if(stu[i]==false){
                System.out.println(i+1);
            }
        }
    }
}