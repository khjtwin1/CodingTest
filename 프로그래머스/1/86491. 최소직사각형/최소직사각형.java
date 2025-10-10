class Solution {
    public int solution(int[][] sizes) {
        int[] max = {0 ,0};
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(sizes[i][0] > max[0])
                max[0] = sizes[i][0];
            if(sizes[i][1] > max[1])
                max[1] = sizes[i][1];
        }
        int answer = max[0]*max[1];
        return answer;
    }
}