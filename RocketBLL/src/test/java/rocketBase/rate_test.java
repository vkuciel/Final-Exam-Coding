package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {
	@Test
	public void Test1() throws RateException {
		assertEquals(RateBLL.getRate(1000), 1.2, 0.2);
		
	}
	
	@Test
	public void Test2() throws RateException {
		double dInterestRate = 0;
		try {
			dInterestRate = RateBLL.getRate(1000);
		}
		catch (RateException r) {
			r.printStackTrace();
		}
		assertEquals(dInterestRate, 5, 0.2);
	}
	
	@Test
	public void GetPaymentTest() {
		double p = RateBLL.getPayment(0.6, 10, 12, 1000, false);
		assertEquals(p, 1000, 0.2);
	}

}
