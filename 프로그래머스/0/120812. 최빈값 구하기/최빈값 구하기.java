import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!list.containsKey(array[i])) {
                list.put(array[i], 1);
            } else {
                list.put(array[i], list.get(array[i]) + 1);
            }
        }
        int max = 0;
        for (int i : list.keySet()) {
            int cnt = list.get(i);
            if (cnt > max) {
                max = cnt;
                answer = i;
            } else if (cnt == max) {
                answer = -1;
            }
        }
        return answer;
    }
}