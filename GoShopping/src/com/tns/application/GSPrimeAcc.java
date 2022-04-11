package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	private static final float Charges = 0;

	public float getCharges() {
		return Charges;
	}
//	Constructor
	public GSPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		super(AccNo, accNm, charges, isPrime);
	}
	@Override
	public void bookProduct(float f) {
		super.bookProduct(f);
	}
   @Override
	public String toString() {
		return "Welcome to GoShopping\n" + super.toString();
	}
}
