package com.ispsearch.ispsearchapiin.utils;

public class ISPSearchUtils {
	
	public static boolean isNotValidPincode(String pincode) {
		try {
			Integer.parseInt(pincode);
			return false;
		}
		catch(NumberFormatException e) {
			return true;
		}
	}

}
