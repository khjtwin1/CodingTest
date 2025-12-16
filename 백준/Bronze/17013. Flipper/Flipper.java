import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] grid = {1,2,3,4,};
        String str = sc.next();
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='H'){
                int temp = grid[0];
                grid[0] = grid[2];
                grid[2] = temp;
                temp = grid[1];
                grid[1] = grid[3];
                grid[3] = temp;
            } else {
                int temp = grid[0];
                grid[0] = grid[1];
                grid[1] = temp;
                temp = grid[2];
                grid[2] = grid[3];
                grid[3] = temp;
            }
        }
        System.out.println(grid[0]+" "+grid[1]);
        System.out.println(grid[2]+" "+grid[3]);
    }
}