class Solution {
    public String[] solution(String my_string) {
        int cnt = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)==' ')
                cnt++;
        }
        String[] answer = new String[cnt+1];
        int j = 0;
        answer[j] = "";
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)==' '){
                j++;
                answer[j] = "";
            } else {
                answer[j] += my_string.charAt(i);
            }
        }
        return answer;
    }
}