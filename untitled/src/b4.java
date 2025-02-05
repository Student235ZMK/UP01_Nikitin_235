import java.util.Scanner;

import static java.lang.Math.*;

public class b4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 1;
        int i = 1;
        while (i <= n){
            S *= (double) i / (i + (2 + 3 * (i - 1)));
            i+=1;
        }
        System.out.println(S);
    }
}