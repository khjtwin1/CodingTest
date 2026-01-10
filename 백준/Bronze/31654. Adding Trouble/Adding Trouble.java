import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer stnz = new StringTokenizer(s, " ");
        int add = 0;
        String answer = "";
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                answer = add == Integer.parseInt(stnz.nextToken()) ? "correct!" : "wrong!";
            } else {
                add += Integer.parseInt(stnz.nextToken());
            }
        }
        System.out.println(answer);
    }
}