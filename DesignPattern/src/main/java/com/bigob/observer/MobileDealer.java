package com.bigob.observer;

import java.util.ArrayList;
import java.util.List;

public class MobileDealer implements Mobile{

	List<Observe> lists=new ArrayList<>();
	public double iphonePrice;
	public double samsungPrice;
	public double oppoPrice;
	
	@Override
	public void addObserver(Observe observe) {
		lists.add(observe);		
	}

	@Override
	public void removeObserver(Observe observe) {
		System.out.println(lists.indexOf(observe)+" is un deleted");
		lists.remove(observe);
		
	}

	@Override
	public void notification() {
		lists.forEach(observ->{
			observ.updatePrice(iphonePrice, samsungPrice, oppoPrice);
		});		
	}

	public void setIphonePrice(double iphonePrice){
		this.iphonePrice=iphonePrice;
		notification();
	}
	
	public void setSamsungPrice(double samsungPrice){
		this.samsungPrice=samsungPrice;
		notification();
	}
	
	public void setOppoPrice(double oppoPrice){
		this.oppoPrice=oppoPrice;
		notification();
	}
}
