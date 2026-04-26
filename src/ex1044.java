import java.util.Scanner;
import java.util.Locale;
public class ex1044 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b  = sc.nextInt();
		if(a%b == 0 || b%a == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();

	}

}
