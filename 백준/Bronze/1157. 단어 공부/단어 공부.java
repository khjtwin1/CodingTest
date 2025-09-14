import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] cnt = new int[26];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 'a') {
                cnt[(int) (S.charAt(i) - 'a')]++;
            } else {
                cnt[(int) (S.charAt(i) - 'A')]++;
            }
        }
        int arrMax = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > cnt[arrMax]) {
                arrMax = i;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            if ((char) (i) != (char) (arrMax) && cnt[i] == cnt[arrMax]) {
                System.out.println("?");
                return;
            }
        }
        System.out.println((char) (arrMax + 'A'));
    }
}