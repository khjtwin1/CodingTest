import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 1; j<=i; j++) {
            for (int n = 1; n<=j; n++)
                System.out.print("*");
        System.out.println();
    	}
    }
}