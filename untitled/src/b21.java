import java.util.Scanner;

import static java.lang.Math.*;

public class b21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        for (int i = 2; i <= 14; i += 2){
            S += i * cos(i * x);
        }
        System.out.println(S);
    }
}