import java.util.Scanner;
import java.util.Locale;

public class ex1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double a, b, c, area_triangulo, area_circulo, pi, area_trapezio, area_quadrado, area_retangulo;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		pi = 3.14159;
		
		area_triangulo = (c*a)/2;
		area_circulo =  pi * Math.pow(c, 2);
		area_trapezio = ((a+b)*c)/2;
		area_quadrado = Math.pow(b, 2);
		area_retangulo = a*b;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",area_triangulo, area_circulo, area_trapezio, area_quadrado, area_retangulo);
		
		sc.close();

	}

}
