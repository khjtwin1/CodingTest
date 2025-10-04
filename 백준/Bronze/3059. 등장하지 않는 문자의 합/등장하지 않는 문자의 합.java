import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int answer = 0;
            int[] cnt = new int[26];
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                cnt[(int) str.charAt(j) - 'A']++;
            }
            for (int k = 0; k < 26; k++) {
                if (cnt[k] == 0)
                    answer += (int)(k + 'A');
            }
            System.out.println(answer);
        }
    }
}