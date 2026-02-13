import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<Character> skipArr = new ArrayList<>();
        for (int i = 0; i < skip.length(); i++) {
            skipArr.add(skip.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cnt = 0;
            while (cnt < index) {
                if (c == 'z') c = 'a';
                else c++;
                if (!skipArr.contains(c)) cnt++;
            }
            answer += c;
        }
        return answer;
    }
}