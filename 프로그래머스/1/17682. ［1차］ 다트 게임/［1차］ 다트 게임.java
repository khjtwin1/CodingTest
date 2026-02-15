import java.util.*;

class Solution {
    public int solution(String dartResult) {
        ArrayList<String> list = new ArrayList<>();
        int[] score = new int[3];
        int idx = 0;
        String num = "";
        for(char c : dartResult.toCharArray()) {
            if (c >= '0' && c <= '9') {
                num += c;
            } else {
                if (!num.equals("")) {
                    list.add(num);
                    score[idx++] = Integer.parseInt(num);
                    num = "";
                }
                list.add(String.valueOf(c));
            }
        }
        
        idx = -1;
        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) >= '0' && list.get(i).charAt(0) <= '9') {
                idx++;
                continue;
            }
            switch(list.get(i)){
                case "S" -> {}
                case "D" -> score[idx] = (int)Math.pow(score[idx], 2);
                case "T" -> score[idx] = (int)Math.pow(score[idx], 3);
                case "*" -> {
                    if(idx>0){
                        score[idx-1] *= 2;
                    }
                    score[idx] *= 2;
                }
                case "#" -> score[idx] *= -1;
            }
        }
        answer = score[0] + score[1] + score[2];
        return answer;
    }
}