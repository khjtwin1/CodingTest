class Solution {
    public int[] solution(String[] wallpaper) {
        int r = wallpaper.length, c = wallpaper[0].length();
        int[] answer = {r, c, 0, 0};
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i + 1);
                    answer[3] = Math.max(answer[3], j + 1);
                }
            }
        }
        return answer;
    }
}