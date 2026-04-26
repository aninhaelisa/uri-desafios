import java.util.Scanner;
import java.util.Locale;

public class ex1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		double qnt = sc.nextInt();
		double preco;
		
		switch(cod){
		
		case 1:
			preco = 4.00 * qnt;
			System.out.printf("Total: R$ %.2f%n",preco);
			break;
			
		case 2:
			preco = 4.50 * qnt;
			System.out.printf("Total: R$ %.2f%n",preco);
			break;
			
		case 3:
			preco = 5.00 * qnt;
			System.out.printf("Total: R$ %.2f%n",preco);
			break;
			
		case 4:
			preco = 2.00 * qnt;
			System.out.printf("Total: R$ %.2f%n",preco);
			break;
			
		case 5:
			preco = 1.50 * qnt;
			System.out.printf("Total: R$ %.2f%n",preco);
			break;
		
		
		}
		
		sc.close();

	}

}
