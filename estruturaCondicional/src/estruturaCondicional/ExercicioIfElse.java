package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioIfElse {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nEgativo = sc.nextInt();
		
		if(nEgativo >= 0 ) {
			System.out.println("valor não negativo " + nEgativo);
		
		}else{
		
		 System.out.printf("negativo " + nEgativo);
		}
		 sc.close();
	}

}
