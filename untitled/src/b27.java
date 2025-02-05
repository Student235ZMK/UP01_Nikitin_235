import java.util.Scanner;

import static java.lang.Math.*;

public class b27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        int i = 1, y = 3;
        do {
            S += sin(i * x) / y;
            i += 2;
            y += 6;
        }while (i <= 7);
        System.out.println(S);
    }
}