class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i<my_string.length(); i++){
            String n = "";
            if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                while(i<my_string.length() && my_string.charAt(i)>='0' && my_string.charAt(i)<='9'){
                    n+=my_string.charAt(i);
                    i++;
                }
            }
            if(!n.equals(""))
                answer+=Integer.parseInt(n);
        }
        return answer;
    }
}