import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        int[] cnt = new int[26];
        while (sc.hasNext()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c != ' ')
                    cnt[c-'a']++;
            }
        }
        int[] sorted = Arrays.copyOf(cnt, cnt.length);
        Arrays.sort(sorted);
        int max = sorted[25];
        for(int i = 0; i<26; i++){
            if(cnt[i]==max)
                answer += (char)(i+'a');
        }
        System.out.println(answer);
    }
}