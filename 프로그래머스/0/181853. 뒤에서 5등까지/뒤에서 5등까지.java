class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int temp = 0;
        for(int i = 0; i<num_list.length-1; i++){
            for(int j = i+1; j<num_list.length; j++){
                if(num_list[i]>num_list[j]){
                    temp = num_list[j];
                    num_list[j] = num_list[i];
                    num_list[i] = temp;
                }
            }
            for(int k = 0; k<5; k++){
                answer[k] = num_list[k];
            }
        }
        return answer;
    }
}