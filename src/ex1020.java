import java.util.Scanner;

public class ex1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anos, meses, dias, resto, n;
		n = sc.nextInt();
		
		anos = n/365;
		resto = n%365;
		meses = resto/30;
		dias = resto%30;
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		sc.close();
	}

}
