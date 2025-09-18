import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            char c = sc.next().charAt(0);
            if (c == '#')
                return;
            int cnt = 0;
            String str = sc.nextLine();
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c)
                    cnt++;
            }
            System.out.println(c + " " + cnt);
        }
    }
}