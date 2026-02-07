import java.util.Scanner;
import java.util.Locale;

public class ex1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, maior;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = (a + b + Math.abs(a - b)) / 2;
		maior = (d + c + Math.abs(d - c)) / 2;
		System.out.println(maior+" eh o maior");
		
		sc.close();
	}

}
