class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i = 0; i<myString.length()-pat.length()+1; i++){
            String check = "";
            for(int j = i; j<i+pat.length(); j++){
                check += myString.charAt(j);
            }
            if(check.equals(pat))
                answer++;
        }
        return answer;
    }
}