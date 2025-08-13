import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int d = 1;
        while(d<=n){
            d*=10;
        }
        d/=10;
        while(d>0){
            answer+=n/d;
            n=n%d;
            d/=10;
        }
        return answer;
    }
}