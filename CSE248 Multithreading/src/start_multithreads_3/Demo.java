package start_multithreads_3;

public class Demo 
{
	static int number = 0;
	
	private synchronized static void increment() 
	{
		number++;
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					increment();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					increment();
				}
				System.out.println();
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread1.setName("My Thread 1");
			System.out.println(thread1.getName());
			thread2.join();
			thread2.setName("My Thread 2");
			System.out.println(thread2.getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(number);
		
	}

}