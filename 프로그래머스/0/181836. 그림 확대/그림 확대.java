import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] picture, int k) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i<picture.length; i++){
            String zoomIn = "";
            for(int j = 0; j<picture[i].length(); j++){
                for(int z = 0; z<k; z++){
                    zoomIn += picture[i].charAt(j);
                }
            }
            for(int j = 0; j<k; j++){
                answer.add(zoomIn);
            }
        }
        return answer;
    }
}