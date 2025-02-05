import java.util.Scanner;

import static java.lang.Math.pow;

public class b14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 1;
        int i = 1;
        do{
            S *= (x - i) / (x - (i + 1));
            i += 2;
        }while (i <= 63);
        System.out.println(S);
    }
}