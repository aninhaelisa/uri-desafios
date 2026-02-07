import java.util.Scanner;

public class ex1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String animal;
		int numero;
		int soma = 0;
		int c = 0;
		int s = 0;
		int r = 0;
		
		for(int i = 0; i<n;i++) {
			numero = sc.nextInt();
			animal = sc.next();
			soma+=numero;
			if(animal.equalsIgnoreCase("c")) {
				c+=numero;
			} else if(animal.equalsIgnoreCase("r")) {
				r+=numero;
			} else if(animal.equalsIgnoreCase("s")) {
				s+=numero;
			}
		}
		

		
		System.out.println("Total: "+soma+" cobaias");
		System.out.println("Total de coelhos: "+c);
		System.out.println("Total de ratos: "+r);
		System.out.println("Total de sapos: "+s);
		
		double porcentagemC = (double) c / soma * 100;
		double porcentagemR = (double) r / soma * 100;
		double porcentagemS = (double) s / soma * 100;
		
		System.out.printf("Percentual de coelhos: %.2f %%%n", porcentagemC);
		System.out.printf("Percentual de ratos: %.2f %%%n", porcentagemR);
		System.out.printf("Percentual de sapos: %.2f %%%n", porcentagemS);
		sc.close();

	}

}
