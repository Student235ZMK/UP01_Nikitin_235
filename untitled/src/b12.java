import java.util.Scanner;

import static java.lang.Math.pow;

public class b12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 0;
        for (int i = 1; i <= n; i++){
            S += (3 * i) * (2 + (i * 2));
        }
        System.out.println(S);
    }
}