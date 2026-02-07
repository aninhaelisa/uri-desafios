import java.util.Scanner;

public class ex1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 1, j = 60; j >= 0; i += 3, j -= 5) {
			System.out.println("I=" + i + " J=" + j);
		}
	
		
		
		sc.close();

	}

}
