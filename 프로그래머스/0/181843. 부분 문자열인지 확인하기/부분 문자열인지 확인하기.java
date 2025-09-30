class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        for(int i = 0; i<my_string.length()-target.length()+1; i++){
            String c = "";
            for(int j = i; j<i+target.length(); j++){
                c += my_string.charAt(j);
            }
            if(c.equals(target))
                return 1;
        }
        return answer;
    }
}