import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int gts = sc.nextInt();
        int wu = sc.nextInt();
        int t;
        if(gts>=20){
            t = (24 - gts) + wu;
        } else
            t = wu - gts;
        System.out.println(t);
    }
}