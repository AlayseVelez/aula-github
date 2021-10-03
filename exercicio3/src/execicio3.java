import java.util.Scanner;

public class execicio3 {

	public static void main(String[] args) {
		
		Scanner ex3 = new Scanner(System.in);
		System.out.println("DIGITE 4 VALORES");
			int A, B, C, D, diferenca;
		    
			A = ex3.nextInt();
			B = ex3.nextInt();
			C = ex3.nextInt();
			D = ex3.nextInt();
			
			diferenca = (A * B - C * D);
		System.out.println("A DIFERENÇA DO PRODUTO É " + diferenca);
		

	}

}
