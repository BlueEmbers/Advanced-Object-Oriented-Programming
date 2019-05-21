package p1;

public class Convert implements ITemp
{

	@Override
	public double letsConvertToCelsius(double temp) 
	{
		return (temp - 32) * 0.5556;
	}

}
