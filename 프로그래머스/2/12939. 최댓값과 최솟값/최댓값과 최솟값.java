import java.util.ArrayList;
import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer stnz = new StringTokenizer(s," ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(stnz.hasMoreTokens()){
            int n = Integer.parseInt(stnz.nextToken());
            if(n > max)
                max = n;
            if(n < min)
                min = n;
        }
        String answer = min + " " + max;
        return answer;
    }
}