class Solution {
    public int solution(int[] arr) {
        int[] copy = new int[arr.length];
        for(int i = 0; i<copy.length; i++){
            copy[i] = arr[i];
        }
        int answer = 0;
        while(true){
            boolean tf = true;
            answer++;
            for(int i = 0; i<arr.length; i++){
                if(arr[i]>=50 && arr[i]%2==0)
                    arr[i] /= 2;
                else if(arr[i]<50 && arr[i]%2==1)
                    arr[i] = arr[i]*2 + 1;
            }
            for(int j = 0; j<copy.length; j++){
                if(copy[j]!=arr[j]){
                    tf = false;
                    for(int i = 0; i<copy.length; i++){
                        copy[i] = arr[i];
                    }
                    break;
                }
            }
            if(tf==true)
                return answer-1;
        }
    }
}