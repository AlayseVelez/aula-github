package application;


import java.util.Scanner;

import entites.Estudante;


public class Program {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		Estudante[] estudant = new Estudante[10];
		
		System.out.println("digite a quantidade de estudantes: ");
		double numeroEstudante = sc.nextDouble();
		
		for(int i = 1; i <= numeroEstudante;i++) {
			    System.out.println();
			    System.out.println("posi??o #" + i + ":");
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("posi?ao: ");
				int posicao = sc.nextInt();
				estudant[posicao] = new Estudante(nome, email);
				
			
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i=0;i<10;i++) {
			if(estudant[i]!=null) {
				System.out.println(i+ ", " +estudant[i]);
			}
			
		}
		
		
		
		
		sc.close();
		
	}

}
