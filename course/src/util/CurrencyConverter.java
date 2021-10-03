package util;

public class CurrencyConverter {
	
	public static double Imposto = 0.06;
	
	
	public static double ValorDolar(double valorDolar, 
	double valorDolarReal) {
		return valorDolar * valorDolarReal*  (1.0 + Imposto);
	}
}
