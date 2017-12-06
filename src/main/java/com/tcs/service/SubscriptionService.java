package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SubscriptionService {

	private static final String PATH = "/subscriptionservice";

	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value = PATH + "/{id}",produces = "application/json; charset=UTF-8")
	
	public ResponseEntity<?> getId(@PathVariable("id") int id) { 
		System.out.print(SubscriptionServiceImpl.checkUserSubcription(id));
		return new ResponseEntity<>(SubscriptionServiceImpl.checkUserSubcription(id), HttpStatus.OK);
		
	}

}
