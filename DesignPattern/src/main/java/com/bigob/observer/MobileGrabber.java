package com.bigob.observer;

public class MobileGrabber implements Observe{

	private double iphonePrice;
	private double samsungPrice;
	private double oppoPrice;
	
	
	public MobileGrabber(MobileDealer mobile) {
		this.iphonePrice=mobile.iphonePrice;
		this.samsungPrice=mobile.samsungPrice;
		this.oppoPrice=mobile.oppoPrice;
	}


	@Override
	public void updatePrice(double iphonePrice, double samsungPrice, double oppoPrice) {
		System.out.println(toString());
	}


	@Override
	public String toString() {
		return "MobileGrabber [iphonePrice=" + iphonePrice + ", samsungPrice=" + samsungPrice + ", oppoPrice="
				+ oppoPrice + "]";
	}
	
	

}
