package com.mouritech.sellermanagementsystemrestapi.exception;

public class SellerNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4558338017526010789L;

	public SellerNotFoundException(Object selid) {
		super(selid != null ?selid.toString() : null);
	}

	
	
}
