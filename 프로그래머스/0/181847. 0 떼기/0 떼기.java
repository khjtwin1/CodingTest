class Solution {
    public String solution(String n_str) {
        String answer = "";
        int n = 0;
        while(n_str.charAt(n)=='0'){
            n++;
        }
        for(int i = n; i<n_str.length(); i++){
            answer+=n_str.charAt(i);
        }
        return answer;
    }
}