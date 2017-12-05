package com.tcs.service;

public class SubscriptionServiceImpl {
	
	public static int  checkUserSubcription(int id) {
		
		 if ( id % 2 == 0 ) {
			 
			 return -1;
		 } else {
			 return id + 1;
		 }
	}

}
