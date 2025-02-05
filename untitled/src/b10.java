import java.util.Scanner;

import static java.lang.Math.pow;

public class b10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 0;
        int i = 1;
        while (i < n){
            S += (double) i * 4 / (i + pow(3, i));
            i++;
        }
        System.out.println(S);
    }
}