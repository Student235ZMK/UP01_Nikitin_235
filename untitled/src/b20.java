import java.util.Scanner;

import static java.lang.Math.*;

public class b20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        int i = 0;
        do {
            S += (3 + i) * sin ((1 + i) * x);
            i += 2;
        }while (i <= 7);
        System.out.println(S);
    }
}