import java.util.Scanner;
import java.util.Locale;

public class ex1016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tempo, distancia;
		distancia = sc.nextInt();
		tempo = distancia *2;
		System.out.println(tempo+" minutos");
		
		sc.close();
	}

}