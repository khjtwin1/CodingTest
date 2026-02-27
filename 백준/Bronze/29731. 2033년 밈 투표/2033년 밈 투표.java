import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] arr = {"Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"};
        List<String> list = Arrays.asList(arr);
        for (int i = 0; i < N; i++) {
            String S = sc.nextLine();
            if (!list.contains(S)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}