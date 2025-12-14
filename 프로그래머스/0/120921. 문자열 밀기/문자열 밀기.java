class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;
        String temp = A;
        for (int i = 1; i<=A.length(); i++){
            String str = "";
            str += temp.charAt(temp.length()-1);
            for (int j = 0; j<temp.length()-1; j++) {
                str += temp.charAt(j);
            }
            temp = str;
            if(temp.equals(B))
                return i;
        }
        return -1;
    }
}
