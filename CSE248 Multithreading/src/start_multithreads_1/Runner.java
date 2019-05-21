package start_multithreads_1;

public class Runner extends Thread
{
	@Override
	public void run()
	{
		for(int i =0; i < 5; i++)
		{
			System.out.println("Hello " + i);
			try 
			{
				Thread.sleep(600);
			} 
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
