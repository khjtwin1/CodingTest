    import java.util.*;
    class Solution {
        public int solution(int a, int b, int c, int d) {
            int[] arr = {a, b, c, d};
            ArrayList<Integer> cnt = new ArrayList<>();
            ArrayList<Integer> list = new ArrayList<>();
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (list.contains(arr[i])) {
                    cnt.set(cnt.size() - 1, cnt.get(cnt.size() - 1) + 1);
                } else {
                    list.add(arr[i]);
                    cnt.add(1);
                }
            }
            if (list.size() == 1) {
                return 1111 * list.get(0);
            } else if (cnt.contains(3)) {
                int p = 0, q = 0;
                for (int i = 0; i < cnt.size(); i++) {
                    if (cnt.get(i) == 3) p = list.get(i);
                    else q = list.get(i);
                }
                return (int)Math.pow(10 * p + q, 2);
            } else if (cnt.get(0) == 2 && cnt.get(1) == 2) {
                return ((list.get(0) + list.get(1)) * Math.abs(list.get(0) - list.get(1)));
            } else if (cnt.contains(2)) {
                int answer = 1;
                for(int i = 0; i<cnt.size(); i++) {
                    if(cnt.get(i) != 2) {
                        answer *= list.get(i);
                    }
                }
                return answer;
            } else {
                return Collections.min(list);
            }
        }
    }