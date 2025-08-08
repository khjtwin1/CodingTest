class Solution {
    public int[] solution(int[][] score){
        double[] av = new double[score.length];
        for (int i = 0; i<av.length; i++){
            av[i] = (score[i][0]+score[i][1]);
        }
        int[] answer = new int[score.length];
        for (int i = 0; i<score.length; i++){
            int rank = 1;
            for (int j = 0; j<score.length; j++){
                if (av[j]>av[i]){
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}