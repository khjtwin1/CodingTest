class Solution {
    public int solution(int num, int k) {
        String n = String.valueOf(num);
        String K = String.valueOf(k);
        for(int i = 0; i<n.length(); i++){
            if(K.equals(String.valueOf(n.charAt(i))))
                return i+1;
        }
        return -1;
    }
}