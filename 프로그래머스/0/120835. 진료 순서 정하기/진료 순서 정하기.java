class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i = 0; i<emergency.length; i++){
            answer[i]++;
        }
        for(int i = 0; i<emergency.length-1; i++){
            for(int j = i+1; j<emergency.length; j++){
                if(emergency[i]>emergency[j]){
                    answer[j]++;
                }
                else {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}