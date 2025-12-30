class Solution {
    public String solution(String s) {
        String answer = "";
        boolean f = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (f == true){
                    answer += Character.toUpperCase(c);
                    f = false;
                } else {
                    answer += Character.toLowerCase(c);
                    f = true;
                }
            } else {
                if (c == ' ') f = true;
                answer += c;
            }
        }
        return answer;
    }
}