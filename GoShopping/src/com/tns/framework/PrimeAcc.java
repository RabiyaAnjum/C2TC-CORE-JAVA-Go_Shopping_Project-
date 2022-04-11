package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
//	isPrime
	private boolean isPrime = true;

	public boolean getisPrime() {
		return this.isPrime;
	}

//	deliveryCharges
	private static final float deliveryCharges = 0;

	public float getDeliverycharges() {
		return deliveryCharges;
	}

//	Constructor
	public PrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		super(AccNo, accNm, charges);
		this.isPrime = isPrime;

	}

	@Override
	public void bookProduct(float f) {
		System.out.println("Your order is Placed");
	}

	@Override
	public String toString() {
		return "You are a Prime Member your delivery charges on any product is " + deliveryCharges + "\n"
				+ super.toString();
	}

////	Override
//	public void bookProduct(float charges) {
//		super.bookProduct(super.getCharges());
////		System.out.println("with Delivery charges is: "+charges);
//	}

}
