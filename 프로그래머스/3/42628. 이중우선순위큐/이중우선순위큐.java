import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {0, 0};
        for (int i = 0; i < operations.length; i++){
            String n = operations[i].substring(2, operations[i].length());
            if (operations[i].charAt(0) == 'I') {
                list.add(Integer.parseInt(n));
            } else {
                if (list.isEmpty()){
                    continue;
                }
                Collections.sort(list);
                if (n.equals("-1")) {
                    list.remove(0);
                } else {
                    list.remove(list.size() - 1);
                }
            }
        }
        if (list.isEmpty()){
            answer[0] = 0;
            answer[1] = 0;
        } else {
            Collections.sort(list);
            answer[0] = list.get(list.size() - 1);
            answer[1] = list.get(0);
        }
        return answer;
    }
}