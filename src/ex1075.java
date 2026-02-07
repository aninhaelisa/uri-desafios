import java.util.Scanner;

public class ex1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 1000;
		
		for(int i = 1; i<x; i++) {
			if(i%n==2) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
