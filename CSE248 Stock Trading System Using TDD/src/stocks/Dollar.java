    
package stocks;

public class Dollar 
{
	private String currency;
	private double price;
	private double rate;
	private RateBag rateBag;

	public Dollar(String currency, double price, RateBag rateBag) 
	{
		this.price = price;
	//	this.rate = getRate(currency);
		this.rateBag = rateBag;
	}

//	private double getRate(String currency) 
//	{
//		
//		
//	}

	public double getDollarAmount() 
	{
		return price / rate;
	}

}