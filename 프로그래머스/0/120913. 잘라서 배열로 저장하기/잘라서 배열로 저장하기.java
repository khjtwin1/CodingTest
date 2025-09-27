class Solution {
    public String[] solution(String my_str, int n) {
        int div = my_str.length()%n == 0 ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[div];
        for(int i = 0; i<div; i++){
            answer[i] = "";
            if(i==div-1){
                for(int j = n*i; j<my_str.length(); j++){
                answer[i] += my_str.charAt(j);
                }
            } else {
                for(int j = n*i; j<n*i+n; j++){
                    answer[i] += my_str.charAt(j);
                }
            }
        }
        return answer;
    }
}