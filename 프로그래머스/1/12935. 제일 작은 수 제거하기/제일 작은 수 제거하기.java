class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            return new int[]{-1};
        }
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(min>arr[i])
                min = arr[i];
        }
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=min){
                answer[j++] = arr[i];
            }
        }
        return answer;
    }
}