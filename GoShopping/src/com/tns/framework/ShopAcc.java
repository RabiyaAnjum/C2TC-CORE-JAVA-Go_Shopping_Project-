package com.tns.framework;

public abstract class ShopAcc {
//	accNo
	private int accNo;

	public int getAccNo() {
		return accNo;
	}

//	accNm
	private String accNm;

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	
//	charges
	private float charges;

	public float getCharges() {
		return charges;
	}

//	Constructor
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

//	abstract bookProduct()
	public abstract void bookProduct(float a);

//	method to display items
	public void items(float x) {
		System.out.println(
				"1. Mobile - 10000 \n2. Laptop - 50000 \n3. watch - 2000 \n4. shirt - 800 \n5. T-shirt - 400\n");
	}

	@Override
	public String toString() {
		return "Continue your Shopping " + accNm + ".\n";
	}



}
