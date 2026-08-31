package util;

public class CurrencyConverter {

	public static double convertCurrency(double dollarPrice, double dollarsToBuy) {
		double c = 0.0;
		c += dollarPrice * dollarsToBuy 
			+ ((dollarPrice * dollarsToBuy)  * (6.0 / 100.0));
		return c;
	}
}