package p2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Demo 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		Converter converter = new Converter();
		System.out.println(converter.letsConvertToCelsius(32));
		
	//	FileOutputStream fos = new FileOutputStream("data.dat");
		
		
	//	ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		TempWrapper tempWrapper = new TempWrapper(converter);
		System.out.println(tempWrapper.letsConvertToFahrenheit(0));
		System.out.println(converter.letsConvertToCelsius(212));

	}

}
