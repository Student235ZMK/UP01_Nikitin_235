import java.util.Scanner;

import static java.lang.Math.*;

public class b7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 11;
        for (int i = 1; i <= n; i++){
            S += 2 * i + 3 * i / ((4 + (5 * (i - 1))) + (5 + (6 * (i - 1)) * 1f));
        }
        System.out.println(S);
    }
}