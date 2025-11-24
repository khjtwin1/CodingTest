import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer stnz = new StringTokenizer(myString, "x");
        while(stnz.hasMoreTokens()){
            list.add(stnz.nextToken());
        }
        String[] answer = new String[list.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}