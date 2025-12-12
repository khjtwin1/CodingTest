import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(!stk.isEmpty() && stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
            } else {
                stk.add(arr[i]);
            }
        }
        if(stk.isEmpty()){
            stk.add(-1);
        }
        return stk;
    }
}