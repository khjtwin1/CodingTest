import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int index = score.length-1;
        for (int i = 0; i < score.length/m; i++) {
            int p = score[index--];
            for (int j = 1; j < m; j++) {
                int n = score[index--];
                if (n < p) p = n;
            }
            answer += p * m;
        }
        return answer;
    }
}