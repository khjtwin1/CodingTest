class Solution {
    public int[] solution(long n) {
        String N = Long.toString(n);
        int[] answer = new int[N.length()];
        for (int i = 0; i < N.length(); i++) {
            answer[N.length() - 1 - i] = N.charAt(i) - '0';
        }
        return answer;
    }
}