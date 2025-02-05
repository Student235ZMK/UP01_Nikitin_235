import java.util.Scanner;

import static java.lang.Math.*;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 0;
        int i = 1;
        do{
            S += 2 + (2 * i) / (5 * i + (7 + 5 * (i - 1)) * 1f);
            i++;
        }while (i <= n);
        System.out.println(S);
    }
}