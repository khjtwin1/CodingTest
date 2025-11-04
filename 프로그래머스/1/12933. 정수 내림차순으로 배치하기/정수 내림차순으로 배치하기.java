class Solution {
    public long solution(long n) {
        String N = Long.toString(n);
        char[] c = new char[N.length()];
        for(int i = 0; i<c.length; i++){
            c[i] = N.charAt(i);
        }
        for(int i = 0; i<c.length-1; i++){
            for(int j = 0; j<c.length-1; j++){
                if(c[j]<c[j+1]){
                    char temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        String s = "";
        for(int i = 0; i<c.length; i++){
            s+=c[i];
        }
        long answer = Long.parseLong(s);
        return answer;
    }
}