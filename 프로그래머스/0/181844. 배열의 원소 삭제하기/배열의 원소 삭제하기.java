class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int n = arr.length;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j])
                    n--;
            }
        }
        int[] answer = new int[n];
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            int check = 0;
            for(int j = 0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){
                    check++;
                }
            }
            if(check==0){
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        return answer;
    }
}