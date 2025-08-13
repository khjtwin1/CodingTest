import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int t4 = sc.nextInt();
        
        int total = t1 + t2 + t3 + t4 + 300;
        
        if(total <= 1800){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}