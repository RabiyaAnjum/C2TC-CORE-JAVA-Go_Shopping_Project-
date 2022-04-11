package com.tns.application;

import com.tns.framework.*;

public class GSNormalAcc extends NormalAcc {
	//	Constructor
	public GSNormalAcc(int AccNo, String accNm, float charges, boolean isPrime) {
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
