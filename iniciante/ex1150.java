import java.util.Scanner;

public class ex1150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int z = sc.nextInt();

        while (z <= x) {
            z = sc.nextInt();
        }

        int soma = 0;
        int contar = 0;
        int atual = x;

        while (soma <= z) {
            soma += atual;
            atual++;
            contar++;
        }

        System.out.println(contar);
		
		sc.close();

	}

}
