package entites;

public class Employee {
	
	private String nome;
	private double salarioBruto ;
	private double imposto;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public Employee(String nome, double salarioBruto, double imposto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}
	public double SalarioLiquido() {
		return salarioBruto - imposto;
	}
	public void AumentoSalario(double porcetagem) {
		 salarioBruto += porcetagem * salarioBruto / 100;
		 
	}
	 public String toString () {
		 return  nome + ", $ "  
					+ String.format("%.2f", SalarioLiquido());
	 }

}
