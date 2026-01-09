import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (int i = 0; i < dic.length; i++) {
            boolean flag = false;
            ArrayList<String> list = new ArrayList<>(Arrays.asList(spell));
            for (int j = 0; j < dic[i].length(); j++) {
                if (!list.contains(Character.toString(dic[i].charAt(j)))) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                    list.remove(Character.toString(dic[i].charAt(j)));
                }
            }
            if (flag == true && list.isEmpty()) {
                answer = 1;
                return answer;
            }
        }
        return answer;
    }
}