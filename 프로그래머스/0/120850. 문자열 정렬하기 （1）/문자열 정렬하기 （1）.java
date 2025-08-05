class Solution {
    public int[] solution(String my_string) {
        int cnt = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)<'a'){
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        int arr = 0;
        for(int i = 0; i<my_string.length(); i++){
            if(my_string.charAt(i)<'a'){
                answer[arr]=(int)(my_string.charAt(i)-'0');
                arr++;
            }
        }
        int temp = 0;
        for(int i = 0; i<answer.length-1; i++){
            for(int j = i+1; j<answer.length; j++){
                if(answer[i]>answer[j]){
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}