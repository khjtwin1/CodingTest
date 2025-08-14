import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Input = sc.next();
        for(int i = 0; i<Input.length(); i++){
            if(Input.charAt(i)<'a')
                System.out.print((char)(Input.charAt(i)+32));
            else
                System.out.print((char)(Input.charAt(i)-32));
        }
    }
}