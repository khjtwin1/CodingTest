class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int j = 0;
        switch(n){
            case 1:
                answer = new int[slicer[1]+1];
                for(int i = 0; i<answer.length; i++){
                    answer[j++] = num_list[i];
                } break;
            case 2:
                answer = new int[num_list.length-slicer[0]];
                for(int i = slicer[0]; i<answer.length+slicer[0]; i++){
                    answer[j++] = num_list[i];
                } break;
            case 3:
                answer = new int[slicer[1]-slicer[0]+1];
                for(int i = slicer[0]; i<answer.length+slicer[0]; i++){
                    answer[j++] = num_list[i];
                } break;
            default:
                answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
                for(int i = slicer[0]; i<=slicer[1]; i+=slicer[2]){
                    answer[j++] = num_list[i];
                }
        }
        return answer;
    }
}