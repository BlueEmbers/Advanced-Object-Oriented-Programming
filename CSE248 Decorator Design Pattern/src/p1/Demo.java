package p1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Demo 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		Convert convert = new Convert();
		System.out.println(convert.letsConvertToCelsius(32));
		
	//	FileOutputStream fos = new FileOutputStream("data.dat");
		
		
	//	ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		TempWrapper tempWrapper = new TempWrapper(convert);
		System.out.println(tempWrapper.letsConvertToFahrenheit(0));
		System.out.println(convert.letsConvertToCelsius(212));

	}

}
