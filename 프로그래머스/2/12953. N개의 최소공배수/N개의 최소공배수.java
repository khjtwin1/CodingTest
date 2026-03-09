class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        int n = 2;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % n == 0) {
                    arr[i] /= n;
                    flag = true;
                }
            }
            if (flag) {
                answer *= n;
            } else {
                n++;
            }
            boolean done = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 1) {
                    done = false;
                    break;
                }
            }
            if (done) break;
        }
        return answer;
    }
}