import java.util.*;

class Solution {
    public String solution(String polynomial) {
        StringTokenizer stnz = new StringTokenizer(polynomial, " ");
        ArrayList<String> list = new ArrayList<>();
        while (stnz.hasMoreTokens()) {
            list.add(stnz.nextToken());
        }
        int a = 0, b = 0;
        for (int i = 0; i < list.size(); i += 2) {
            String s = list.get(i);
            if (s.charAt(s.length() - 1) == 'x') {
                if (s.length() == 1) {
                    a++;
                } else a += Integer.parseInt(s.replace("x", ""));
            } else b += Integer.parseInt(s);
        }
        String answer = "";
        if (a == 1)
            answer += "x";
        else if (a > 0)
            answer += a + "x";
        if (a == 0) {
            answer += b;
        } else if (b > 0) {
            answer += " + " + b;
        }
        return answer;
    }
}