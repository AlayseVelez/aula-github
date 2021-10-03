package exercico4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ex4 = new Scanner(System.in);
		 
		double valorSalario = 0, SALARY;
		int numeroFuncionario, numeroHoras;
		System.out.println("1- DIGITI O NUMERO DO FUNCIONARIO,"
		+ " 2- O NUMERO DE HORAS TRABALHADO 3- O VALOR A RECEBER ");
		
		numeroFuncionario = ex4.nextInt();
		numeroHoras = ex4.nextInt();
		valorSalario = ex4.nextDouble();
		
		
		SALARY = (numeroHoras * valorSalario);
		
		
		System.out.println("O NUMBER " + numeroFuncionario);
		System.out.printf("O SALARY %.2f%n ",SALARY);
		
		ex4.close();
	}

}
