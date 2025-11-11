import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<N; i++){
            String str = sc.next();
            if(!list.contains(str))
                list.add(str);
        }
        list.sort((a,b) -> {
            if(a.length() != b.length()){
                return a.length()-b.length();
            }
            else {
                return a.compareTo(b);
            }
        });
        for(String s : list){
            System.out.println(s);
        }
    }
}