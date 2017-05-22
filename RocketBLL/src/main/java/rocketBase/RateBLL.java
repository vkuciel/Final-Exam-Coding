package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;

		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		for (RateDomainModel r : rates) {
			if(GivenCreditScore > r.getiMinCreditScore()) {
				dInterestRate = r.getdInterestRate();
			}
			else {
				return dInterestRate;
			}
			if (dInterestRate < 0) {
				throw new RateException(r);
			}
			else {
			return dInterestRate;
			}}
		return dInterestRate;
		}
		
		
		
	
		
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r/12, n*12, p, f, t);
	}
}
