class Solution {
    public int solution(String before, String after) {
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for(int i = 0; i<before.length();i++){
            cnt1[before.charAt(i)-'a']++;
        }
        for(int i = 0; i<after.length();i++){
            cnt2[after.charAt(i)-'a']++;
        }
        for(int i = 0; i<26; i++){
            if(cnt1[i]!=cnt2[i])
                return 0;
        }
        return 1;
    }
}