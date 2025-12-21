import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean[] tf = new boolean[3];
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A')
                tf[0] = true;
            else if (S.charAt(i) == 'B')
                tf[1] = true;
            else if (S.charAt(i) == 'C')
                tf[2] = true;
        }
        String answer = "";
        if (tf[0] == true) {
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c == 'B' || c == 'C' || c == 'D' || c == 'F') {
                    answer += 'A';
                } else {
                    answer += c;
                }
            }
        } else if (tf[0] == false && tf[1] == true) {
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c == 'C' || c == 'D' || c == 'F') {
                    answer += 'B';
                } else {
                    answer += c;
                }
            }
        } else if (tf[0] == false && tf[1] == false && tf[2] == true) {
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c == 'D' || c == 'F') {
                    answer += 'C';
                } else {
                    answer += c;
                }
            }
        } else {
            for (int i = 0; i < S.length(); i++) {
                answer += 'A';
            }
        }
        System.out.println(answer);
    }
}