package thread_synchronization_2;

import java.util.Scanner;

public class Demo {
	private static volatile boolean flag = true;
	
	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();
		System.out.println("Press return to pause: ");
		Scanner kb  = new Scanner(System.in);
		kb.nextLine();
		p1.shutdonw();
	}
	
	private static class Processor extends Thread{
		public void run() {
				while (flag) {
					System.out.println("\t\t\tHello world!");
				}
			}

		public void shutdonw() {
			flag = false;
		};
	}

}