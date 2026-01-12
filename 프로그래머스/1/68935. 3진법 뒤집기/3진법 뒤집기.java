class Solution {
    public int solution(int n) {
        String tri = Integer.toString(n, 3);
        String s = "";
        for (int i = tri.length() - 1; i >= 0; i--) {
            s += tri.charAt(i);
        }
        int answer = Integer.parseInt(s, 3);
        return answer;
    }
}