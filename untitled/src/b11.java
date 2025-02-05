import java.util.Scanner;

import static java.lang.Math.pow;

public class b11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 1;
        int i = 1, z = 1;
        do {
            S *= pow((double) i / (i + 1),z);
            z *= -1;
            i+=2;
        }while (i < n * 2);
        System.out.println(S);
    }
}