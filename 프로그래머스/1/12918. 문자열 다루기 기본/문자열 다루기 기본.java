class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4||s.length()==6){
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)>='A'&&s.charAt(i)<='z')
                    return answer;
            }
            answer = true;
        }
        return answer;
    }
}