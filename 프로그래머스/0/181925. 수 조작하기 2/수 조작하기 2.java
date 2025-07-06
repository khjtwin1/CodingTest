class Solution {
    public String solution(int[] numLog) {
        String answer = "";

        for(int i = 0; i<numLog.length-1; i++){
            int sum = numLog[i+1]-numLog[i];
            switch(sum){
                case 1 : answer+="w"; break;
                case -1 : answer+="s"; break;
                case 10 : answer+="d"; break;
                case -10 : answer+="a"; break;
            }
            // if(numLog[i]+1==numLog[i+1])
            //     answer+="w";
            // else if(numLog[i]-1==numLog[i+1])
            //     answer+="s";
            // else if(numLog[i]+10==numLog[i+1])
            //     answer+="d";
            // if(numLog[i]-10==numLog[i+1])
            //     answer+="a";
        }
        return answer;
    }
}