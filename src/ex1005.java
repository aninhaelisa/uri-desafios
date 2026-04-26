import java.util.Scanner;

public class ex1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double a, b, media;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		media = (a * 3.5 + b * 7.5) / 11;
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
	}

}
