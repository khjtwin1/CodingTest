class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        for(int i = 0; i<str2.length()-str1.length()+1; i++){
            String check = "";
            for(int j = i; j<i+str1.length(); j++){
                check += str2.charAt(j);
            }
            if(check.equals(str1))
                return 1;
        }
        return answer;
    }
}