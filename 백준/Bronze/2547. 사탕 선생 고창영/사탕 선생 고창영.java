import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++){
            int N = sc.nextInt();
            BigInteger C = new BigInteger("0");
            for(int j = 0; j<N; j++) {
                C = C.add(sc.nextBigInteger());
            }
            if (C.mod(BigInteger.valueOf(N)).equals(BigInteger.ZERO))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}