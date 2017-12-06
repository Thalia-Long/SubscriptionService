package com.tcs.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyJaxbBean {


	    public boolean subscribed;
	    public int amount;

	    public MyJaxbBean() {} // JAXB needs this

	    public MyJaxbBean(boolean subscribed, int amount) {
	      this.subscribed = subscribed;
	      this.amount = amount;
	    }
}

