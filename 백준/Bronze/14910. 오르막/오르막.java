import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer stnz = new StringTokenizer(str," ");
        int N = Integer.parseInt(stnz.nextToken());
        while (stnz.hasMoreTokens()){
            int n = Integer.parseInt(stnz.nextToken());
            if(n<N){
                System.out.println("Bad");
                return;
            }
            N = n;
        }
        System.out.println("Good");
    }
}