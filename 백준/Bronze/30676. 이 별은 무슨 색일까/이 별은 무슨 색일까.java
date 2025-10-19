import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String color = "";
        if(n>=620&&n<=780){
            color = "Red";
        }
        else if(n>=590&&n<=620){
            color = "Orange";
        }
        else if(n>=570&&n<=590){
            color = "Yellow";
        }
        else if(n>=495&&n<=570){
            color = "Green";
        }
        else if(n>=450&&n<=495){
            color = "Blue";
        }
        else if(n>=425&&n<=450){
            color = "Indigo";
        }
        else{
            color = "Violet";
        }
        System.out.println(color);
    }
}