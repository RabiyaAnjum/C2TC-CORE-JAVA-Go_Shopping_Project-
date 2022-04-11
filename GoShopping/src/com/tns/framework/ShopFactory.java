package com.tns.framework;

public abstract class ShopFactory {

	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime);

	public abstract NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, boolean isPrime);
}
//Abstract methods: As per PDF data
