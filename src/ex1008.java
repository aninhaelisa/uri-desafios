import java.util.Scanner;

public class ex1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number, horas_trab;
		Double valor_hr, salario;
		
		number = sc.nextInt();
		horas_trab = sc.nextInt();
		valor_hr = sc.nextDouble();
		salario = valor_hr * horas_trab;
		
		System.out.println("NUMBER = "+ number);
		System.out.printf("SALARY = U$ %.2f%n",salario);
	
		
		
		sc.close();

	}

}
