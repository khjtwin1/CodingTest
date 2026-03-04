import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        ArrayList<Integer> list = new ArrayList<>();
        int t = tangerine[0];
        int cnt = 1;
        for (int i = 1; i < tangerine.length; i++) {
            if (tangerine[i] == t) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
            }
            t = tangerine[i];
        }
        list.add(cnt);
        cnt = 0;
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            int temp = cnt + list.get(i);
            if (temp >= k) {
                answer++;
                break;
            } else {
                answer++;
                cnt = temp;
            }
        }
        return answer;
    }
}