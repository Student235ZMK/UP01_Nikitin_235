import java.util.Scanner;

import static java.lang.Math.*;

public class b6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 11;
        for (int i = 1; i <= n - 1; i++){
            S *= 4 * i / ((1 + (2 * (i - 1))) + (3 + (6 * (i - 1))) * 1f);
        }
        System.out.println(S);
    }
}