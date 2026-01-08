class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int n = brown + yellow;
        for (int i = 1; i * i <= n; i++){
            if (n % i == 0) {
                answer[0] = n / i;
                answer[1] = i;
                if ((answer[0] - 2) * (answer[1] - 2) == yellow)
                    return answer;
            }
        }
        return answer;
    }
}