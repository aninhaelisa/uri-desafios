import java.util.Scanner;

public class ex1002 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n, raio, area;

        n = 3.14159;
        raio = sc.nextDouble();
        area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }

}
