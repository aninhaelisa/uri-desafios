import java.util.Scanner;
import java.util.Locale;

public class ex1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, resto, quociente, nota;
		n = sc.nextInt();
		System.out.println(n);
		resto = n;
		
		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto%nota;
		
		nota = 50;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto%nota;
		
		nota = 20;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto%nota;
		
		nota = 10;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto%nota;
		
		nota = 5;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto%nota;
		
		nota = 2;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto%nota;
		
		nota = 1;
		quociente = resto/nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
		resto = resto%nota;
		
		sc.close();
	}

}
