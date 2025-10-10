class Solution {
    public int[] solution(int[] answers) {
        int[] R = new int[3];
        int[][] patterns = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        for(int i = 0; i<answers.length; i++){
            for(int j = 0; j<3; j++){
                if(patterns[j][i%patterns[j].length]==answers[i])
                    R[j]++;
            }
        }
        int max = R[0];
        if (R[1] > max)
            max = R[1];
        if (R[2] > max)
            max = R[2];
        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            if (R[i] == max)
                cnt++;
        }
        int[] answer = new int[cnt];
        int j = 0;
        for (int i = 0; i < 3; i++) {
            if (R[i] == max)
                answer[j++] = i + 1;
        }
        return answer;
    }
}