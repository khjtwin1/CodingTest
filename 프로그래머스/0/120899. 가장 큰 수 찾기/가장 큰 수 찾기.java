class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int idx = 0;
        for(int i = 1; i<array.length; i++){
            if (max < array[i]){
                max = array[i];
                idx = i;
            }
        }
        
        int[] answer = new int[2];
        answer[0] = max;
        answer[1] = idx;
        return answer;
    }
}