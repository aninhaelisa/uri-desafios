import java.util.Scanner;
public class ex1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, qtd1, qtd2;
		Double valor1, valor2, total;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total =  (qtd1 * valor1) + (qtd2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
		
		sc.close();

	}

}
