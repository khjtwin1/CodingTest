import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maxN = "";
        int maxP = -1;
        int l = 0, o = 0, v = 0, e = 0;

        String YD = sc.next();
        for(int i = 0; i<YD.length(); i++){
            char c = YD.charAt(i);
            switch (c){
                case 'L':
                    l++; break;
                case 'O':
                    o++; break;
                case 'V':
                    v++; break;
                case 'E':
                    e++; break;
            }
        }

        int N = sc.nextInt();
        sc.nextLine();
        String[] names = new String[N];

        for(int i = 0; i < N; i++){
            names[i] = sc.next();
        }
        Arrays.sort(names);
        for (int i = 0; i < N; i++) {
            int L = l, O = o, V = v, E = e;
            String name = names[i];
            for(int j = 0; j<name.length(); j++){
                char c = name.charAt(j);
                switch (c){
                    case 'L':
                        L++; break;
                    case 'O':
                        O++; break;
                    case 'V':
                        V++; break;
                    case 'E':
                        E++; break;
                }
            }
            int p = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;
            if(p>maxP) {
                maxP = p;
                maxN = name;
            }
        }
        System.out.println(maxN);
    }
}