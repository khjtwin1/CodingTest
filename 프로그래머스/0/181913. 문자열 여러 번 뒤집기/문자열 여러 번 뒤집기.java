class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int i = 0; i<queries.length; i++){
            String str = "";
            for(int j = 0; j<queries[i][0]; j++){
                str+=my_string.charAt(j);
            }
            for(int j = queries[i][1]; j>=queries[i][0]; j--){
                str+=my_string.charAt(j);
            }
            for(int j = queries[i][1]+1; j<my_string.length(); j++){
                str+=my_string.charAt(j);
            }
            my_string = str;
        }
        answer = my_string;
        return answer;
    }
}