import java.util.Scanner;

import static java.lang.Math.*;

public class b25{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        int i = 1;
        while (i <= 9){
            S += (cos(i) / i * 2);
            i+=2;
        }
        System.out.println(S);
    }
}