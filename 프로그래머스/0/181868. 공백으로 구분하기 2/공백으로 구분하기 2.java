class Solution {
    public String[] solution(String my_string) {
        int cnt = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)!=' '){
                cnt++;
                while(i<my_string.length() && my_string.charAt(i)!=' ')
                    i++;
            }
        }
        String[] answer = new String[cnt];
        int j = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)!=' '){
                answer[j] = "";
                while(i<my_string.length() && my_string.charAt(i)!=' '){
                    answer[j]+=my_string.charAt(i);
                    i++;
                }
                j++;
            }
        }
        return answer;
    }
}