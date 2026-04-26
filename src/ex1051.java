import java.util.Scanner;
public class ex1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double imposto = salario;
		if (salario <= 2000.00) {
		    System.out.println("Isento");
		} else if (salario <= 3000.00) {
		    imposto = (salario - 2000.00) * 0.08;
		} else if (salario <= 4500.00) {
		    imposto = 1000.00 * 0.08;
		    imposto += (salario - 3000.00) * 0.18;
		} else {
		    imposto = 1000.00 * 0.08;
		    imposto += 1500.00 * 0.18;
		    imposto += (salario - 4500.00) * 0.28;
		}

		if (salario > 2000.00) {
		    System.out.printf("R$ %.2f%n", imposto);
		}
		sc.close();

	}

}
