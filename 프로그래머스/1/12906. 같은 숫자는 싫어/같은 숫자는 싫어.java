import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int n = arr[0];
        answer.add(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != n){
                answer.add(arr[i]);
                n = arr[i];
            }
        }
        return answer;
    }
}