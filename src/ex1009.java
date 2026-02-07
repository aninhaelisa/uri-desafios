import java.util.Scanner;
public class ex1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		Double salario, vendas_efetuadas, total;
		nome = sc.next();
		salario = sc.nextDouble();
		vendas_efetuadas = sc.nextDouble();
		total = salario + (vendas_efetuadas* 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();

	}

}