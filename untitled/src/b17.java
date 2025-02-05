import java.util.Scanner;

import static java.lang.Math.*;

public class b17{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int i = 0;
        double S = 0;
        do{
            S += 1 / pow(x, i);
            i += 2;
        }while (i <= 6);
        System.out.println(S);
    }
}