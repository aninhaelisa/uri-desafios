import java.util.Scanner;
import java.util.Locale;
public class ex1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tempo, velocidade;
		double litros;
		
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		litros = (tempo * velocidade)/(double)12;
		
		System.out.printf("%.3f%n",litros);
		sc.close();

	}

}
