import java.util.Scanner;

import static java.lang.Math.*;

public class b26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        int i = 1;
        do{
            S += sin(i * x) / pow(i, 2);
            i+=2;
        }while (i <= 9);
        System.out.println(S);
    }
}