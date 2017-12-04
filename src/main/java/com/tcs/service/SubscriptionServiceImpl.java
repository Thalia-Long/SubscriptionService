package com.tcs.service;

public class SubscriptionServiceImpl {
	
	public static boolean  checkUserSubcription(int id) {
		
		 if ( id % 2 == 0 ) {
			 
			 return true;
		 } else {
			 return false;
		 }
	}

}
