import java.util.Scanner;
import java.util.Locale;

public class ex1019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, h, m, s, resto;
		n = sc.nextInt();
		
		h = n / 3600;
		resto = n % 3600;
		
		m = resto/60;
		resto = n%60;
		
		s = resto;
		
		System.out.println(h+":"+m+":"+s);
		sc.close();
	}

}
