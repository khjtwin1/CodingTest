import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int k = n;
        for (int i = 2; i <= n; i++) {
            if (k % i == 0) {
                while (k % i == 0) {
                    k /= i;
                }
                answer.add(i);
            }
        }
        return answer;
    }
}