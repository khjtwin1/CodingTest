class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for (int i = 0; i < k - 1; i++) {
            if (answer + 1 == numbers.length) {
                answer = 1;
            } else if(answer == numbers.length) {
                answer = 2;
            } else {
                answer += 2;
            }
        }
        return answer;
    }
}