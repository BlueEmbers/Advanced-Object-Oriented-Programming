package wait_notify;

import java.util.Scanner;

public class Processor {
//	Object lock = new Object();
	
	public void produce() throws InterruptedException {
		synchronized(this) {
			System.out.println("Producer thread is running and waiting...");
			wait(); // wait and release the lock
			System.out.println("Producer thread is resumed");
		}
	}
	
	public void consume() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized(this) {
			System.out.println("Waiting for return key: ");
			scanner.nextLine();
			System.out.println("Return key pressed.");
			notify(); // notify waiting thread to get ready for a lock
			Thread.sleep(5000);
		}
	}
}