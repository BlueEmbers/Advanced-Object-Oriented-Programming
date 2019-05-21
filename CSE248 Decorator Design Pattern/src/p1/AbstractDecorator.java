package p1;

public abstract class AbstractDecorator implements ITemp
{
	private ITemp iTemp;
	public AbstractDecorator(ITemp iTemp)
	{
		this.iTemp = iTemp;
	}
	
//	public double letsConvertToCelsius(double temp)
//	{
//		return iTemp.letsConvertToCelsius(temp);
//	}
	
	public double letsConvertToFahrenheit(double temp)
	{
		return 30 * temp + 32;
	}
}
