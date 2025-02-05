import java.util.Scanner;

import static java.lang.Math.*;

public class b23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        for (int i = 0; i <= 12; i += 2){
            S += cos((1 + i) * x);
        }
        System.out.println(S);
    }
}