class Solution {
    public String solution(String s) {
        String answer = "";
        boolean first = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (first) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
            } else {
                answer += c;
            }
            if (c == ' '){
                first = true;
            } else {
                first = false;
            }
        }
        return answer;
    }
}