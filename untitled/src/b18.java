import java.util.Scanner;

import static java.lang.Math.*;

public class b18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        for (int i = 1; i <= 15; i += 2){
            S += i * x * sin(i * x);
        }
        System.out.println(S);
    }
}