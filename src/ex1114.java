import java.util.Scanner;

public class ex1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		int n = sc.nextInt();

		while (n != senha) {
			System.out.println("Senha Invalida");
			n = sc.nextInt();
		}

		System.out.println("Acesso Permitido");
		sc.close();
	}

}
