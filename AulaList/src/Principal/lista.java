package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Entidades.Funcionario;

public class lista {

	public static void main(String[] args) {
		
		List<Funcionario> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Funcionario fun;
		
		System.out.println("Digiti quantos funcionarios deseja cadastrar: ");
		int quantidade = sc.nextInt();
		
		for(int i=1; i<=quantidade; i++) {
			System.out.println("Cadastro #" + i + ":");
			
			System.out.println("Id: ");
			int id = sc.nextInt();
			
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario(nome,salario,id));
			
			System.out.println(list);
		}
		System.out.println();
		System.out.println("Digite o id do funcionario que irá receber a porcetagem: ");
		int ide = sc.nextInt();
		Funcionario func = list.stream().filter( x -> x.getIdentificador() == ide).findFirst().orElse(null);
		if(func == null) {
			System.out.println("id não existe");
		}else {
			System.out.println("Digiti a porcentagem: ");
				double por = sc.nextDouble();
				func.salarioComPorcetagem(por);
			
		}
		
		System.out.println();
		System.out.println(" Lista de funcionarios");
		for(Funcionario f: list) {
			System.out.println(f);
		}
		
        
        sc.close();
      
	}

}
