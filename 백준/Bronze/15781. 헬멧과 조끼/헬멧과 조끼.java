import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int helmet = sc.nextInt();
        int vest = sc.nextInt();
        long h_Max = Long.MIN_VALUE, v_Max = Long.MIN_VALUE;
        for(int i = 0; i<helmet; i++){
            long defence = sc.nextInt();
            if(h_Max<defence){
                h_Max = defence;
            }
        }
        for(int i = 0; i<vest; i++){
            long defence = sc.nextInt();
            if(v_Max<defence){
                v_Max = defence;
            }
        }
        System.out.println(h_Max + v_Max);
    }
}