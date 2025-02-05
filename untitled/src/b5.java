import java.util.Scanner;

import static java.lang.Math.*;

public class b5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 113;
        int i = 1;
        do{
            S += pow(2, i) / pow(5, i);
            i++;
        }while (i <= n);
        System.out.println(S);
    }
}