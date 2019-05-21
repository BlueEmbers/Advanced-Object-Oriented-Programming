package p2;

public class TempWrapper extends AbstractDecorator
{

	private Converter converter;
	public TempWrapper(Converter converter) 
	{
		super(converter);
		this.converter = converter;
		
	}
	
	@Override
	public double letsConvertToFahrenheit(double temp)
	{
		return 30 * temp + 32;
	}
	
	

}
