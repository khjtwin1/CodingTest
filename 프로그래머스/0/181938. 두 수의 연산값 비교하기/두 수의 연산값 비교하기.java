class Solution {
    public int solution(int a, int b) {
        int mul = 2 * a * b;
        int sum = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int answer = mul >= sum ? mul : sum;
        return answer;
    }
}