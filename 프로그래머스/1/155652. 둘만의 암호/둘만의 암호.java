import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        ArrayList<Character> skipArr = new ArrayList<>();
        for (char c : skip.toCharArray()) {
            skipArr.add(c);
        }
        for (char c : s.toCharArray()) {
            int cnt = 0;
            while (cnt < index) {
                c++;
                if (c > 'z') c = 'a';
                if (!skipArr.contains(c)) cnt++;
            }
            answer += c;
        }
        return answer;
    }
}