package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	private RateDomainModel r;
	public RateException(RateDomainModel r2) {
		super();
		r2 = r;

	}

	public RateDomainModel getr() {
		return r;
	}

	//	RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
}
