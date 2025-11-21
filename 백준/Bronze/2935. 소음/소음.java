import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        char c = sc.next().charAt(0);
        BigInteger B = new BigInteger(sc.next());
        if(c=='*'){
            System.out.println(A.multiply(B));
            return;
        }
        System.out.println(A.add(B));
    }
}
