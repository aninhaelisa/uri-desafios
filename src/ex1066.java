import java.util.Scanner;
public class ex1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int positivos = 0 , pares = 0, impares = 0, negativos = 0;
		
		for(int i = 0; i<5; i++) {
			int n = sc.nextInt();
			if(n<0) {
				negativos++;
			} else if(n>0) {
				positivos++;
			} 
			if(n%2==0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.println(pares+" valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos+" valor(es) positivo(s)");
		System.out.println(negativos+" valor(es) negativo(s)");
		sc.close();
	}

}
