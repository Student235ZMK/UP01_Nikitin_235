import java.util.Scanner;

import static java.lang.Math.*;

public class b29{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        int i = 1;
        do{
            S += (i + 1) * x / i;
            i+=2;
        }while (i <= 9);
        System.out.println(S);
    }
}