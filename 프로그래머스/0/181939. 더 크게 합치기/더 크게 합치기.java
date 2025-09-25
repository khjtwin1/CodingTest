class Solution {
    public int solution(int a, int b) {
        String n1 = Integer.toString(a) + Integer.toString(b);
        String n2 = Integer.toString(b) + Integer.toString(a);
        int N1 = Integer.parseInt(n1);
        int N2 = Integer.parseInt(n2);
        int answer = N1 >= N2 ? N1 : N2;
        return answer;
    }
}