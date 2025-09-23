class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int[] temp = new int[array.length];
        int min = n;
        for(int i = 0; i<temp.length; i++){
            if(array[i]==n)
                return n;
            int cal = array[i]-n > 0 ? array[i]-n : (array[i]-n)*(-1);
            if(cal<min){
                min = cal;
                answer = array[i];
            }
            else if(cal==min){
                answer = array[i]<answer ? array[i] : answer;
            }
        }
        return answer;
    }
}