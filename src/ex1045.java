import java.util.Scanner;
import java.util.Locale;

public class ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double temp;
        if(b > a) { temp = a; a = b; b = temp; }
        if(c > a) { temp = a; a = c; c = temp; }
        if(c > b) { temp = b; b = c; c = temp; }

        double epsilon = 0.000001;

        if(a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if(Math.abs(Math.pow(a,2) - (Math.pow(b,2)+Math.pow(c,2))) < epsilon) {
                System.out.println("TRIANGULO RETANGULO");
            } else if(Math.pow(a,2) > Math.pow(b,2)+Math.pow(c,2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if(Math.pow(a,2) < Math.pow(b,2)+Math.pow(c,2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if(Math.abs(a-b) < epsilon && Math.abs(b-c) < epsilon) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if(Math.abs(a-b) < epsilon || Math.abs(b-c) < epsilon || Math.abs(a-c) < epsilon) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}