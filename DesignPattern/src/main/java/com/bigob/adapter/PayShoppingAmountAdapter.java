package com.bigob.adapter;

public class PayShoppingAmountAdapter {

	public String shoppingAmount(String cardName, String cardHolderName, Long atmNumber, Integer pin, Long amount) {
		PaypalService paypalService = null;
		Integer code = 0;
		if (cardName == "VISA") {
			code = 3210;
		}
		if (cardName == "Master") {
			code = 7328;
		}
		if (cardName == "Mestro") {
			code = 2354;
		}
		if (cardName == "Rupay") {
			code = 5654;
		}
		paypalService = PaypalService.getInstance();
		return paypalService.approvedPayment(code, cardHolderName, atmNumber, pin, amount);
	}

}
