package stocks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockBagTest {
	static StockBag theBag;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		theBag = new StockBag(10);
		theBag.insert("IBM", 1000, 25);
		theBag.insert("GE", 400, 100);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		double actual = 0.0;
		
		actual = theBag.getGrandTotal();
		assertEquals(65000, actual);
	}

}
