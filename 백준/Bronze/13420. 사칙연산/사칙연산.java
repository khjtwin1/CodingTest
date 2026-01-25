import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            StringTokenizer stnz = new StringTokenizer(s);
            long a = Long.parseLong(stnz.nextToken());
            String op = stnz.nextToken();
            long b = Long.parseLong(stnz.nextToken());
            stnz.nextToken(); // "="
            long result = Long.parseLong(stnz.nextToken());
            long calc = 0;
            switch (op) {
                case "+":
                    calc = a + b; break;
                case "-":
                    calc = a - b; break;
                case "*":
                    calc = a * b; break;
                case "/":
                    calc = a / b; break;
            }
            if (calc == result) {
                System.out.println("correct");
            } else {
                System.out.println("wrong answer");
            }
        }
    }
}
