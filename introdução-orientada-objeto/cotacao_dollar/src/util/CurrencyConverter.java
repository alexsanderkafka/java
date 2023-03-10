package util;

public class CurrencyConverter {
	
	public double priceDollar, unDollar;
	
	public double converter() {
		return (priceDollar * 0.06 + priceDollar) * unDollar;
	}
}