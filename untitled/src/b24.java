import java.util.Scanner;

import static java.lang.Math.*;

public class b24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        for (int i = 1; i <= 7; i+=2){
            S += (i + 1) * cos(i * x);
        }
        System.out.println(S);
    }
}