class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            String remove = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                } else {
                    remove += '1';
                }
            }
            int n = remove.length();
            s = "";
            while (true) {
                s = Integer.toString(n % 2).concat(s);
                if (n == 1) break;
                n /= 2;
            }
            answer[0]++;
        }
        return answer;
    }
}