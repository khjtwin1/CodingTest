import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        for (; i <=9; i++)
            System.out.println(N + " * " + i + " = " + N*i);
    }
}