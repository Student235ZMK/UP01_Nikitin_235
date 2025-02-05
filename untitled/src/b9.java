import java.util.Scanner;

import static java.lang.Math.*;

public class b9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 111;
        for (int i = 1; i <= n; i++){
            S *= sqrt(5 * i) / sqrt(pow(7, i));
            System.out.println(5 * i + " " + pow(7, i));
        }
        System.out.println(S);
    }
}