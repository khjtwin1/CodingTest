import java.util.ArrayList;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][moves[i]-1] != 0) {
                    int doll = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    if (!arr.isEmpty() && arr.get(arr.size()-1) == doll){
                        answer += 2;
                        arr.remove(arr.size()-1);
                    } else {
                        arr.add(doll);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}