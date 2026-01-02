class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int n = 0;
            switch (arr[1]) {
                case "+" -> n = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                case "-" -> n = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            }
            answer[i] = (n == Integer.parseInt(arr[4])) ? "O" : "X";
        }
        return answer;
    }
}