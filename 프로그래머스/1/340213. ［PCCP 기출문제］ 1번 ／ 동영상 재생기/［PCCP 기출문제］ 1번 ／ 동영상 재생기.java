class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5));
        int os = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        int oe = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));
        int current = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));
        if (current >= os && current < oe) current = oe;
        
        for (String c : commands) {
            if (c.equals("prev")) {
                current -= 10;
                if (current < 0) current = 0;
            } else if (c.equals("next")) {
                current += 10;
                if (current > video) current = video;
            }
            if (current >= os && current < oe) current = oe;
        }
        return String.format("%02d:%02d", current / 60, current % 60);
    }
}