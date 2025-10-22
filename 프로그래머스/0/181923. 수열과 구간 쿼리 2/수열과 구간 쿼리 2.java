class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0; i<queries.length; i++){
            int[] arrN = new int[3];
            boolean flag = false;
            int min = 1000000;
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int j = s; j<=e; j++){
                if(arr[j]>k && arr[j]<min){
                    min = arr[j];
                    flag = true;
                }
            }
            if(flag==false)
                answer[i] = -1;
            else
                answer[i] = min;
        }
        return answer;
    }
}