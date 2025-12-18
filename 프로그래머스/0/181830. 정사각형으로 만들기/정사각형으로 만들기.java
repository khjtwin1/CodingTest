class Solution {
    public int[][] solution(int[][] arr) {
        int rowM = arr.length;
        int columnM = 0;
        for(int i = 0; i<arr.length; i++){
            if(columnM<arr[i].length)
                columnM = arr[i].length;
        }
        int big = rowM > columnM ? rowM : columnM;
        int[][] answer = new int[big][big];
        
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}