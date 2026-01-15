class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int i = 0, j = 0;
        for (int k = 0; k < goal.length; k++) {
            String w = goal[k];
            if (i < cards1.length && cards1[i].equals(w)) {
                i++;
            } else if (j < cards2.length && cards2[j].equals(w)) {
                j++;
            } else {
                return "No";
            }
        }
        return answer;
    }
}