import java.util.*;

class Solution {
    int getIndex(String data) {
        switch (data) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            default: return 3;
        }
    }
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx = getIndex(ext), sortIdx = getIndex(sort_by);
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] d : data) {
            if (d[extIdx] < val_ext) list.add(d);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i)[sortIdx] > list.get(j)[sortIdx]) {
                    int[] temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        int[][] answer = new int[list.size()][4];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}