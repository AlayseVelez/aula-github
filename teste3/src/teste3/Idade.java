package teste3;
import java.util.Scanner;



public class Idade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int idadeDias = leitor.nextInt();
        int anos = idadeDias / 365;
        idadeDias -=  anos  * 365; //implemente no espa�o em branco
        int meses = idadeDias / 30;
        idadeDias -=  meses  * 30;  //implemente no espa�o em branco
        int dias = idadeDias;
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
        leitor.close();
	}

}
