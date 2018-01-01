package com.bigob.observer;

public class TrackObserver {

	public static void main(String[] args) {
		MobileDealer mobile=new MobileDealer();
		mobile.setIphonePrice(1000);
		mobile.setOppoPrice(12000);
		mobile.setSamsungPrice(12000);
		MobileGrabber mobileGrabber=new MobileGrabber(mobile);
		
		mobile.addObserver(mobileGrabber);
		mobile.notification();
	}
}
