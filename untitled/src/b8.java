import java.util.Scanner;

import static java.lang.Math.*;

public class b8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 23;
        int i = 1, z = -1;
        do{
            S += ((6 + 5 * (i - 1)) / (pow(2, i) * pow(3, i))) * z;
            i++;
            z*=-1;
        }while (i<=n-1);
        System.out.println(S);
    }
}