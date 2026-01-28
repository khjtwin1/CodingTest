import java.util.Calendar;

class Solution {
    public String solution(int a, int b) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a - 1, b);
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return day[dayOfWeek - 1];
    }
}