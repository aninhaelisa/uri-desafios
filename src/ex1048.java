import java.util.Scanner;
import java.util.Locale;
public class ex1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double salarioTotal = salario;
		double aumento;
		int percentual;
		
		if(salario<=400.00) {
			salarioTotal*=1.15;
			percentual = 15;
		} else if(salario<=800.00) {
			salarioTotal*=1.12;
			percentual = 12;
		} else if(salario<=1200.00) {
			salarioTotal*=1.10;
			percentual = 10;
		} else if(salario<=2000) {
			salarioTotal*=1.07;
			percentual = 7;
		} else {
			salarioTotal*=1.04;
			percentual = 4;
		}
		
		aumento = salarioTotal - salario;
		
		System.out.printf("Novo salario: %.2f%n", salarioTotal);
		System.out.printf("Reajuste ganho: %.2f%n", aumento);
		System.out.printf("Em percentual: %d %%\n", percentual);
		
		sc.close();
	}

}
