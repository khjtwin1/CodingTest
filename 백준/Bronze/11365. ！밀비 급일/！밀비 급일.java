import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            if(str.equals("END"))
                return;
            String change = "";
            for(int i = str.length()-1; i>=0; i--){
                change += str.charAt(i);
            }
            System.out.println(change);
        }
    }
}