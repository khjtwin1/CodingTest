import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long dif = N - M;
        if(dif >= 0)
            System.out.println(dif);
        else
            System.out.println(dif * -1);
    }
}