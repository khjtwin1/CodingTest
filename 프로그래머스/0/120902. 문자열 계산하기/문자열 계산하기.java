class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean plus = true;
        boolean flag = false;
        String num = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c == '+') {
                plus = true;
            } else if (c == '-') {
                plus = false;
            } else if (c == ' ' && num != "") {
                flag = true;
            } else if (c != ' ') {
                num += c;
            }
            if (flag || i == my_string.length() - 1) {
                if(plus == true) answer += Integer.parseInt(num);
                else answer -= Integer.parseInt(num);
                num = "";
                flag = false;
            } 
        }
        return answer;
    }
}