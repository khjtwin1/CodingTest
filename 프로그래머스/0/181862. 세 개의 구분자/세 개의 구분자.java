import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        String str = "";
        for(int i = 0; i < myStr.length(); i++){
            if (myStr.charAt(i) != 'a' && myStr.charAt(i) != 'b' && myStr.charAt(i) != 'c') {
                str += myStr.charAt(i);
            }
            else if (!str.isEmpty()){
                answer.add(str);
                str = "";
            }
        }
        if (!str.isEmpty()){
            answer.add(str);
        }
        if(answer.isEmpty()){
            answer.add("EMPTY");
        }
        return answer;
    }
}