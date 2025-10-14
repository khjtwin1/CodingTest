class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] Bc = new char[26];
        for(int i = 0; i<Bc.length; i++){
            Bc[i] = (char)(i+'A');
        }
        char[] Sc = new char[26];
        for(int i = 0; i<Sc.length; i++){
            Sc[i] = (char)(i+'a');
        }
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                answer += Bc[(s.charAt(i) - 'A' + n) % 26];
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                answer += Sc[(s.charAt(i) - 'a' + n) % 26];
            }
            else
                answer += s.charAt(i);
        }
        return answer;
    }
}