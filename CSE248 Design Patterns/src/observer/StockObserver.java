package observer;

public class StockObserver implements Observer {
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	private int observerID;

	private Observable stockSubject;

	private static int observerIDTracker = 0;

	public StockObserver(Observable stockSubject) {
		this.stockSubject = stockSubject;
		observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		stockSubject.register(this);
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		printPrices();
	}

	private void printPrices() {
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
	}

}
