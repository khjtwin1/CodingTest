class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0,even = 0;
        for (int i = 0; i<num_list.length; i++) {
            if (num_list[i]%2==0)
                even++;
            else odd++;
        }
        int[] answer = {even, odd};
        return answer;
    }
}