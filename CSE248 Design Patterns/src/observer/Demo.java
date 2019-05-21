package observer;

public class Demo {

	public static void main(String[] args) {
		StockSubject stocks = new StockSubject();
		StockObserver observer1 = new StockObserver(stocks);
		StockObserver observer2 = new StockObserver(stocks);
		stocks.setAaplPrice(100);
		stocks.setAaplPrice(50);
		stocks.setGoogPrice(30);
		stocks.unregister(observer2);
		stocks.setGoogPrice(1206);
	}

}
