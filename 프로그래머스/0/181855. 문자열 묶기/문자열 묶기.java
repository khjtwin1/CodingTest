class Solution {
    public int solution(String[] strArr) {
        int[] cnt = new int[31];
        for(int i = 0; i<cnt.length; i++){
            cnt[i] = 0;
        }
        for(int i = 0; i<strArr.length; i++){
            cnt[strArr[i].length()]++;
        }
        int max = 0;
        for(int i = 0; i<cnt.length; i++){
            if(cnt[i]>max)
                max = cnt[i];
        }
        return max;
    }
}