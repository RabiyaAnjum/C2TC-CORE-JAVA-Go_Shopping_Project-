package com.tns.application;

import com.tns.framework.*;

public class GSShopFactory extends ShopFactory {
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		System.out.println(GsPrime.toString());
		return GsPrime;
	}
    @Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSNormalAcc GsNormal = new GSNormalAcc(accNo, accNm, charges, isPrime);
		System.out.println(GsNormal.toString());
		return GsNormal;
	}
public static void main(String[] args) {

	}

}
