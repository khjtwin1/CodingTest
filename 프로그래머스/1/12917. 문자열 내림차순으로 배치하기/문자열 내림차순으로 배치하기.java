class Solution {
    public String solution(String s) {
        char[] arr = new char[s.length()];
        for(int i = 0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]<arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String answer = "";
        for(int i = 0; i<arr.length; i++){
            answer+= arr[i];
        }
        return answer;
    }
}