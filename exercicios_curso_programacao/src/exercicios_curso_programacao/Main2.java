package exercicios_curso_programacao;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) {
			
			System.out.println("senha inválida ");
			
			  senha = sc.nextInt();
		}
		System.out.println("acesso permitido");
		sc.close();

	}

}
