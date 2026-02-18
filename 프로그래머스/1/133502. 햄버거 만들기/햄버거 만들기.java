import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int n: ingredient) {
            arr.add(n);
            int size = arr.size();
            if(size >= 4 &&
               arr.get(size - 4) == 1 &&
               arr.get(size - 3) == 2 &&
               arr.get(size - 2) == 3 &&
               arr.get(size - 1) == 1) {
                arr.subList(size - 4, size).clear();
                answer++;
            }
        }
        return answer;
    }
}