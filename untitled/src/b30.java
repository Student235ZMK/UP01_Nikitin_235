import java.util.Scanner;

import static java.lang.Math.*;

public class b30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double S = 0;
        for (int i = 4; i >= 0; i--){
            S += pow(2, i) / pow(x, 2) + i;
            System.out.println(pow(2, i) + " " + (pow(x, 2) + i));
        }
        System.out.println(x * S);
    }
}