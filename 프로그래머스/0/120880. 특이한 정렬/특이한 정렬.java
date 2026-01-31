class Solution {
    public int[] solution(int[] numlist, int n) {
        for (int i = 0; i < numlist.length - 1; i++) {
            for (int j = i + 1; j < numlist.length; j++) {
                int d1 = Math.abs(numlist[i] - n);
                int d2 = Math.abs(numlist[j] - n);
                if ((d1 > d2) || (d1 == d2 && numlist[i] < numlist[j])) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        return numlist;
    }
}