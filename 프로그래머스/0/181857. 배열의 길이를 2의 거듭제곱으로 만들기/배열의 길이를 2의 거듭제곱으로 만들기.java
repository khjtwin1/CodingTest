import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            answer.add(arr[i]);
        }
        int size = 1;
        while(size<answer.size()){
            size *= 2;
        }
        while(answer.size()<size){
            answer.add(0);
        }
        return answer;
    }
}