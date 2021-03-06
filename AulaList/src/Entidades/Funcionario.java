package Entidades;

public class Funcionario {
	
	private String nome;
	private double salario;
	private int identificador;
	
	public Funcionario(String nome, double salario, int identificador) {
		this.nome = nome;
		this.salario = salario;
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	 
	public void salarioComPorcetagem(double porcentagem) {
		this.salario += this.salario * porcentagem / 100; 
	}
	public String toString() {
		 return  identificador+ ", " +nome+  String.format("%.2f", salario);
	 }
	

}
