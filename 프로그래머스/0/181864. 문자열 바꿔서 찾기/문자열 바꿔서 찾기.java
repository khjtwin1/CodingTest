class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String change = "";
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'A') {
                change += 'B';
            } else
                change += 'A';
        }
        for(int i = 0; i < myString.length() - pat.length() + 1; i++){
            String check = "";
            for(int j = i; j < i + pat.length(); j++){
                check += change.charAt(j);
            }
            if(check.equals(pat))
                return 1;
        }
        return answer;
    }
}