class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int add = nums[i] + nums[j] + nums[k];
                    boolean flag = false;
                    for (int n = 2; n < add; n++) {
                        if (add % n == 0) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) answer++;
                }
            }
        }
        return answer;
    }
}