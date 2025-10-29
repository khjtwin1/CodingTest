import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sh = sc.nextInt();
        int sm = sc.nextInt();
        int cook = sc.nextInt();
        
        int fh = sh + (sm+cook)/60;
        int fm = (sm+cook)%60;
        fh %= 24;
        System.out.println(fh + " " + fm);
    }
}