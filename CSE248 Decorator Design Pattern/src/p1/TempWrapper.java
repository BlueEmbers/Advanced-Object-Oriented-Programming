package p1;

public class TempWrapper extends AbstractDecorator
{

	private ITemp iTemp;
	public TempWrapper(ITemp iTemp) 
	{
		super(iTemp);
		this.iTemp = iTemp;
		
	}

	@Override
	public double letsConvertToCelsius(double temp) 
	{
		
		return ((Convert)iTemp).letsConvertToCelsius(temp);
	}
	
	@Override
	public double letsConvertToFahrenheit(double temp)
	{
		return 30 * temp + 32;
	}
	
	

}
