import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resistor = "";
        for(int i = 0; i<2; i++) {
            String c = sc.next();
            switch (c){
                case "black" : resistor += "0"; break;
                case "brown" : resistor += "1"; break;
                case "red" : resistor += "2"; break;
                case "orange" : resistor += "3"; break;
                case "yellow" : resistor += "4"; break;
                case "green" : resistor += "5"; break;
                case "blue" : resistor += "6"; break;
                case "violet" : resistor += "7"; break;
                case "grey" : resistor += "8"; break;
                default: resistor += "9";
            }
        }
        long answer = Long.parseLong(resistor);
        String c3 = sc.next();
        switch (c3){
            case "black" : answer*=1; break;
            case "brown" : answer*=10; break;
            case "red" : answer*=100; break;
            case "orange" : answer*=1000; break;
            case "yellow" : answer*=10000; break;
            case "green" : answer*=100000; break;
            case "blue" : answer*=1000000; break;
            case "violet" : answer*=10000000; break;
            case "grey" : answer*=100000000; break;
            default: answer*=1000000000; break;
        }
        System.out.println(answer);
    }
}