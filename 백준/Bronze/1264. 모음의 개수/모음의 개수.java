import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] gather = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        while (true) {
            int gcnt = 0;
            String str = sc.nextLine();
            if (str.equals("#")) {
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < 10; j++) {
                    if (str.charAt(i) == gather[j]) {
                        gcnt++;
                        break;
                    }
                }
            }
            System.out.println(gcnt);
        }
    }
}