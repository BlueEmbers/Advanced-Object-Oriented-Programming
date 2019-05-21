package synchronized_Code_block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private Random random = new Random();
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();
	
	public void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}
	
	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt());
		}
		
	}
	
	public void process() {
		for(int i = 0; i < 5000; i++) {
			stageOne();
			stageTwo();
		}
	}
	
	public void main() {
		System.out.println("Starting ...");
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
			
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				process();
			}
			
		});
		long start = System.currentTimeMillis();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Time took: " + (System.currentTimeMillis() - start));
		System.out.println("List 1: " + list1.size() +"\t" + "List 2: " + list2.size());
	}
}