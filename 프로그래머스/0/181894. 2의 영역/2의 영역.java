class Solution {
    public int[] solution(int[] arr) {
        int start = 0, end = 0;
        boolean check = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==2){
                start = i;
                check = true;
                break;
            }
        }
        if(check==false)
            return new int[]{-1};
        for(int i = arr.length-1; i>=start; i--){
            if(arr[i]==2){
                end = i;
                break;
            }
        }
        if(end-start+1==0)
            return new int[]{arr[start]};
        int[] answer = new int[end-start+1];
        int j = 0;
        for(int i = start; i<=end; i++){
            answer[j++] = arr[i];
        }
        return answer;
    }
}