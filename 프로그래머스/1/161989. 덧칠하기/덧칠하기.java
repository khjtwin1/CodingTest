class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = 0;
        for (int s : section) {
            if (s > paint) {
                answer++;
                paint = s + m - 1;
            }
        }
        return answer;
    }
}