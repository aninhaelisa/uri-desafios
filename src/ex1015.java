import java.util.Scanner;
import java.util.Locale;

public class ex1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2, distancia,x,y;
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x = x1 - x2;
		y = y1 - y2;
		distancia = Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
		System.out.printf("%.4f%n",distancia);
		
		sc.close();
	}

}
