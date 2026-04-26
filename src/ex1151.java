import java.util.Scanner;

public class ex1151 {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        int a = 0;
	        int b = 1;

	        for (int i = 0; i < n; i++) {

	            if (i == 0) {
	                System.out.print(a);
	            } 
	            else if (i == 1) {
	                System.out.print(" " + b);
	            } 
	            else {
	                int proximo = a + b;
	                System.out.print(" " + proximo);
	                a = b;
	                b = proximo;
	            }
	        }

	        System.out.println();
	        sc.close();

	}

}
