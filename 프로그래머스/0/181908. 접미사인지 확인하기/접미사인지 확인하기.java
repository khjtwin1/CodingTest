class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] suffix = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            suffix[i] = "";
            for(int j = i; j < my_string.length(); j++){
                suffix[i] += my_string.charAt(j);
            }
            if(suffix[i].equals(is_suffix))
                return 1;
        }
        return answer;
    }
}