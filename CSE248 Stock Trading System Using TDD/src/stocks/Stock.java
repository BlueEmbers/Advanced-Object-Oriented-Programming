package stocks;

public class Stock 
{

	private String instrument;
	private double shares;
	private double price;
	
	public Stock(String instrument, double shares, double price) 
	{
		this.instrument = instrument;
		this.shares = shares;
		this.price = price;
	}

	public double getTotal()
	{
		return shares * price;
	}

	public double getShares() 
	{
		return shares;
	}

	public double getPrice() 
	{
		return price;
	}

}
