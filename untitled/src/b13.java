import java.util.Scanner;

import static java.lang.Math.pow;

public class b13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 3;
        int z = 4, i = 1;
        while (i <= n * 2 - 2){
            S *= (double) z / i;
            z += 5;
            i += 2;
        }
        System.out.println(S);
    }
}