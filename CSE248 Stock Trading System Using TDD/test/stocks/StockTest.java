package stocks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StockTest {

	@Test
	void testStock() {
		double actual1 = 0;
		double actual2 = 0;
		Stock stock1 = new Stock("IBM", 1000.00, 25.00);
		actual1 = stock1.getTotal();
		Stock stock2 = new Stock("GE", 400.00, 100.00);
		actual2 = stock2.getTotal();
		assertEquals(25000, actual1);
		assertEquals(40000, actual2);
	}
	

}
