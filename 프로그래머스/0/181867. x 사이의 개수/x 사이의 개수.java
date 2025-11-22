class Solution {
    public int[] solution(String myString) {
        int cnt = 0;
        for(int i = 0; i<myString.length(); i++){
            if(myString.charAt(i)=='x')
                cnt++;
        }
        int[] answer = new int[cnt+1];
        int i = 0;
        int n = 0;
        for(int j = 0; j<myString.length(); j++){
            if(myString.charAt(j)=='x'){
                answer[i++] = n;
                n = 0;
            } else{
                n++;
            }
        }
        answer[i] = n;
        return answer;
    }
}