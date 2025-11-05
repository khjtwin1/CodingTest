import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];
        int minB = Integer.MAX_VALUE;
        int minD = Integer.MAX_VALUE;
        for(int i = 0; i<3; i++){
            burger[i] = sc.nextInt();
            if(burger[i]<minB)
                minB = burger[i];
        }
        for(int i = 0; i<2; i++){
            drink[i] = sc.nextInt();
            if(drink[i]<minD)
                minD = drink[i];
        }
        System.out.println(minB+minD-50);
    }
}