class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int l = 0;
        for(int i = 0; i<arr.length; i++){
            boolean find = false;
            for(int j = 0; j<l; j++){
                if(arr[i]==answer[j]){
                    find = true;
                    break;
                }
            }
            if(find==false && l<k)
                answer[l++] = arr[i];
        }
        for(int i = l; i<k; i++){
            answer[i] = -1;
        }
        return answer;
    }
}