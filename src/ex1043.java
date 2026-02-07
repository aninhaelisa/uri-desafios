import java.util.Scanner;
import java.util.Locale;

public class ex1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, perimetro, area;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if(a+b>c && b+c>a && c+a>b) {
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		} else {
			area = ((a+b)*c)/2;
			System.out.printf("Area = %.1f%n", area);
		}
		
		sc.close();
	}

}
