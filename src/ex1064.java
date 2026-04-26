import java.util.Scanner;
import java.util.Locale;

public class ex1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int positivo = 0;
		double soma = 0;
		
		for(int i = 0; i<6; i++) {
			double n = sc.nextDouble();

			if(n>0) {
				positivo++;
				soma += n;
			}
		}
		
		double media = soma/positivo;
		
		System.out.println(positivo+" valores positivos");
		System.out.printf("%.1f%n",media);
		
		sc.close();
	}

}
