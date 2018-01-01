package com.bigob.adapter;

public class PaypalService {

	private static PaypalService paypalService=null;
	private PaypalService(){
		//empty private constructor to avoid object creation through constructor
	}
	
	public static PaypalService getInstance(){
		if(paypalService==null){
			synchronized(PaypalService.class){
				if(paypalService==null){
					paypalService=new PaypalService();
				}
			}
		}
		return paypalService;
	}

	public String approvedPayment(Integer code, String cardHolderName, Long atmNumber, Integer pin,Long amount) {
		return "Hi "+cardHolderName+" your Payment Approved of Ruppee :Rs."+amount;
	}
}
