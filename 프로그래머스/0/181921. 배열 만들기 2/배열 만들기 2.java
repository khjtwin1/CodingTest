import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String s = Integer.toString(i);
            ArrayList<Character> charArr = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                charArr.add(s.charAt(j));
            }
            boolean flag = true;
            for (char c : charArr) {
                if (c != '0' && c!='5') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr.add(i);
            }
        }
        if (arr.size() == 0) {
            return new int[]{-1};
        }
        int[] answer = new int[arr.size()];
        int j = 0;
        for (int i : arr) {
            answer[j++] = i;
        }
        return answer;
    }
}