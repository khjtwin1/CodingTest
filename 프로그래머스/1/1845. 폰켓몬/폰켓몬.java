import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = list.size(); i > 0; i--) {
            if (i <= nums.length / 2) {
                return i;
            }
        }
        return 0;
    }
}