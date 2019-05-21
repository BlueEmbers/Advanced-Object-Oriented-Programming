package observer;

import java.util.ArrayList;

public class StockSubject implements Observable {

	private ArrayList<Observer> observerList;
	private double value1;
	private double aaplPrice;
	private double googPrice;

	public StockSubject() {
		observerList = new ArrayList<>();
	}

	@Override
	public void register(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int observerIndex = observerList.indexOf(o);
		observerList.remove(observerIndex);
		System.out.println("Observer " + (observerIndex + 1) + " deleted.");
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observerList) {
			observer.update(value1, aaplPrice, googPrice);
		}
	}
	
	public void setValue1 (double ibmPrice) {
		this.value1 = ibmPrice;
		notifyObservers();
	}
	
	public void setAaplPrice (double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObservers();
	}
	
	public void setGoogPrice (double googPrice) {
		this.googPrice = googPrice;
		notifyObservers();
	}

}
