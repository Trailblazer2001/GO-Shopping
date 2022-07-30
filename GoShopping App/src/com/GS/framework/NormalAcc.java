package com.GS.framework;

public class NormalAcc extends ShopAcc
{
	private final static float deliveryCharges = 60.0f;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharges = deliveryCharges;
	}
}


