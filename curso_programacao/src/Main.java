import java.util.Locale;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	
		/** Scanner sc = new Scanner(System.in);
		System.out.println("Digiti 3 palavras");
		
		String al1, al2, al3;
		al1 = sc.nextLine();
		al2 = sc.nextLine();
		al3 = sc.nextLine();
		
		System.out.println("Você digitou");
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al3);
		 sc.close(); */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor do raio");
	 double raio, area, pi = 3.14159;
		 raio = sc.nextDouble();
		     area = pi * raio * raio; 
		        System.out.printf("A soma dos valores é = %.4f%n",area);
		 
		sc.close();
	}
}
