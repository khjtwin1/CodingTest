class Solution {
    public int solution(int[] sides) {
        for(int i = 0; i<sides.length-1; i++){
            int min = i;
            for(int j = i+1; j<sides.length; j++){
                if(sides[i]>sides[j])
                    min = j;
            }
            int temp = sides[i];
            sides[i]=sides[min];
            sides[min]=temp;
            
        }
        int answer = sides[2]<sides[0]+sides[1] ? 1 : 2;
        return answer;
    }
}