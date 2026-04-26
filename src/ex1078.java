import java.util.Scanner;

public class ex1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma;
		if (2<n&& n<1000) {
			for(int i = 1; i<=10; i++ ) {
				soma = i*n;
				System.out.println(i+" x "+n+" = "+soma);
			}
		}
		
		
		sc.close();

	}

}
