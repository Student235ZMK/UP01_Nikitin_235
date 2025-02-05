import java.util.Scanner;

import static java.lang.Math.*;

public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 0;
        int i = 2;
        while (i <= n * 2){
            S += (double) i / (i + 1);
            i+=2;
        }
        System.out.println(S);
    }
}