class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            boolean flag = true;
            for (int j = 0; j < targets[i].length(); j++) {
                int min = 101;
                char c = targets[i].charAt(j);
                for (int m = 0; m < keymap.length; m++) {
                    int idx = keymap[m].indexOf(c);
                    if (idx >= 0) {
                        min = Math.min(min, idx + 1);
                    }
                }
                if (min == 101) {
                    flag = false;
                    break;
                }
                sum += min;
            }
            answer[i] = flag ? sum : -1;
        }
        return answer;
    }
}