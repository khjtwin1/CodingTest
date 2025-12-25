import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int file = sc.nextInt();
        for (int i = 0; i < file; i++) {
            String str = sc.next();
            String answer = "";
            char before = ' ';
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c != before) {
                    answer += c;
                }
                before = c;
            }
            System.out.println(answer);
        }
    }
}