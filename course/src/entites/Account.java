package entites;

public class Account {
	
	public int numero;
	public String nome;
	public double saldo;
	
	
	public Account(int numero, String nome) {
		
		this.numero = numero;
		this.nome = nome;
	}


	public Account(int numero, String nome, double saldo) {
		
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		this.saldo+=valor;
	}
	public void saque(double valor) {
		this.saldo -= valor +5;
		
	}


	public int getNumero() {
		return numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Conta: "+ +numero+ ", Nome: "
	+ nome+ String.format(", valor: %.2f", getSaldo()) ;
	}

}
