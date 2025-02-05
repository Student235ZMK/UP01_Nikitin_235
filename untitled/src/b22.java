import java.util.Scanner;

import static java.lang.Math.*;

public class b22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        int i = 0;
        while (i<=8){
            S += sin((1 + i) * x) / (3 + i);
            i += 2;
        }
        System.out.println(S);
    }
}