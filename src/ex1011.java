import java.util.Scanner;
import java.util.Locale;

public class ex1011 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double r = sc.nextDouble();
        double volume = (4.0 / 3.0) * pi * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}