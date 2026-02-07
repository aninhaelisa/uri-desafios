import java.util.Scanner;

public class ex1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		
		while(x!=4) {
			x = sc.nextInt();
			if(x==3) {
				diesel+=1;
			}else if(x==1) {
				alcool +=1;
			}else if(x==2) {
				gasolina +=1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		
		sc.close();

	}

}
