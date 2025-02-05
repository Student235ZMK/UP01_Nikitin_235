import java.util.Scanner;

import static java.lang.Math.*;

public class b16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int i = 1;
        double S = 0;
        while (i <= 7){
            S += i / pow(x, i);
            i += 2;
        }
        System.out.println(S);
    }
}