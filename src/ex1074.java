import java.util.Scanner;

public class ex1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for(int i = 0; i<n; i++){
			numeros[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i<n; i++) {
			if(numeros[i]==0) {
				System.out.println("NULL");
			}else if(numeros[i]%2==0) {
				
				System.out.print("EVEN ");
				if(numeros[i]>0) {
					System.out.printf("POSITIVE%n");
				}else {
					System.out.printf("NEGATIVE%n");
				}
				
			}else {
				System.out.print("ODD ");
				if(numeros[i]>0) {
					System.out.printf("POSITIVE%n");
				}else {
					System.out.printf("NEGATIVE%n");
				}
			}
		}
		
		sc.close();

	}

}
