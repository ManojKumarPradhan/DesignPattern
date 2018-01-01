package com.bigob.adapter;

public class PayShoppingAmount {

	public String payAmount(String cardName,String cardHolderName,Long atmNumber,Integer pin, Long amount){
		return new PayShoppingAmountAdapter().shoppingAmount(cardName,cardHolderName,atmNumber,pin,amount);
	}
}
