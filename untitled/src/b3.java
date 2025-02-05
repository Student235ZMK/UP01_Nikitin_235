import java.util.Scanner;

import static java.lang.Math.*;

public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double S = 0;
        for (int i = 1; i<=n; i++){
            S += 3 * i / ((3 + 4 * (i - 1) * (4 + 5 * (i -1))) * 1f);
        }
        System.out.println(S);
    }
}