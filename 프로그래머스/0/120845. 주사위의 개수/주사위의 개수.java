class Solution {
    public int solution(int[] box, int n) {
        int area = 1;
        for (int i = 0; i<box.length; i++){
            area *= box[i];
        }
        int[] arr = new int[3];
        int sum = 1;
        for(int i = 0; i<box.length; i++){
            arr[i] = box[i]/n;
            sum *= arr[i];
        }
        
        int answer = sum;
        return answer;
    }
}