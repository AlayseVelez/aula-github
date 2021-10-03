package entites;

public class Product {
	
	//atributos
	public String name;
	public double price;
	public int quantity;
	
	//metodos
	
	public double totalValorStock() {
		return price * quantity;
		
	}
	public void addProductValor(int quantity) {
		this.quantity += quantity;
	}
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	public String  toString() {
		return name + ", $ " 
	+  String.format("%.2f", price) 
	+ " ," + String.format("%.2f", totalValorStock());
	}

}
