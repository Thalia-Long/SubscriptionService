package com.tcs.service;

public class SubscriptionServiceImpl {

	public static MyJaxbBean  checkUserSubcription(int id) {
		
		 if ( id % 2 == 0 ) {
			 MyJaxbBean even = new MyJaxbBean(false, 0);
			 return even;
		 } else {
			 int amount = id - 1000000;
			 MyJaxbBean odd = new MyJaxbBean(true, amount);
			 return odd;
		 }
	}

}
