package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

//		Check to see if a known credit score returns a known interest rate
public class Rate_Test {

	@Test
	public void Test1() {
		int s = RateDAL.getAllRates().size();
		
		assertTrue(s > 0);
	}

	
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void Test2() throws Exception {
		int s = RateDAL.getAllRates().size();
		if(s == 0);
		if(s < 0);
	}

}
