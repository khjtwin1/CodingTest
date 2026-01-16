class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            boolean f = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0){
                    f = false;
                    break;
                }
            }
            if (f) {
                answer++;
            }
        }
        return answer;
    }
}