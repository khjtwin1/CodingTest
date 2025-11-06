import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        StringTokenizer stnr = new StringTokenizer(s, " ");
        while(stnr.hasMoreTokens()){
            stnr.nextToken();
            cnt++;
        }
        System.out.println(cnt);
    }
}