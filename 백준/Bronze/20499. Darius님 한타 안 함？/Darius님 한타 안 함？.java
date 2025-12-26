import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringTokenizer stnz = new StringTokenizer(str, "/");
        int K = Integer.parseInt(stnz.nextToken());
        int D = Integer.parseInt(stnz.nextToken());
        int A = Integer.parseInt(stnz.nextToken());
        if (K + A < D || D == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}