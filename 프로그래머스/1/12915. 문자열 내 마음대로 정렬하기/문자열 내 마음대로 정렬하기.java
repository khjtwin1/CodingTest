import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt(n) == strings[j].charAt(n)) {
                    String[] compare = {strings[i], strings[j]};
                    Arrays.sort(compare);
                    strings[i] = compare[0];
                    strings[j] = compare[1];
                }
                if (strings[i].charAt(n) > strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }
}