class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int n = 0;
        for (int i = n + pat.length(); i <= myString.length(); i++) {
            String s = myString.substring(n, i);
            if (s.contains(pat)) {
                answer = myString.substring(0, i);
                n = i;
            }
        }
        return answer;
    }
}