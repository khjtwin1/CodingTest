class Solution {
    public int[] solution(int n, String[] words) {
        int p = 2, cnt = 1;
        char c = words[0].charAt(words[0].length() - 1);
        for (int i = 1; i < words.length; i++) {
            if (c != words[i].charAt(0)) {
                return new int[] {p, cnt};
            }
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    return new int[] {p, cnt};
                }
            }
            c = words[i].charAt(words[i].length() - 1);
            p++;
            if (p > n) {
                p = 1;
                cnt++;
            }
        }
        return new int[] {0, 0};
    }
}