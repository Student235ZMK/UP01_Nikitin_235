import java.util.Scanner;

import static java.lang.Math.*;

public class b15{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double ch = 0, zn = 0;
        double S = 1;
        for(int i = 1; i<=n; i++){
            ch += cos(i);
            zn += sin(i);
            S *= ch / zn;
        }
        System.out.println(S);
    }
}