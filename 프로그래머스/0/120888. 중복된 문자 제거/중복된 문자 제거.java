class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer += my_string.charAt(0);
        for(int i = 1; i<my_string.length(); i++){
            boolean flag = false;
            for(int j = 0; j<i; j++){
                if(my_string.charAt(i)==my_string.charAt(j))
                    flag = true;
            }
            if(!flag){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}