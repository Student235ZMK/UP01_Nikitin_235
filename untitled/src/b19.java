import java.util.Scanner;

import static java.lang.Math.*;

public class b19{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        int i = 1;
        while (i <= 7){
            S += (sin(i) / i * 2);
            i++;
        }
        System.out.println(S);
    }
}