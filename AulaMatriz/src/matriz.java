import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digiti o tamnho da matriz");
		int tamanho1 = sc.nextInt();
		int tamanho2 = sc.nextInt();
		int [][] mat = new int[tamanho1][tamanho2];
		
		for(int i=0;i<tamanho1;i++) {
			for(int j=0;j<tamanho2;j++) {
               //prencher a matriz 
				mat[i][j] = sc.nextInt();
				
				
			}
		}
		
		
	}

}
