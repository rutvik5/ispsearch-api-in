package com.ispsearch.ispsearchapiin.utils;

import java.util.Optional;

public class ISPSearchUtils {
	
	public static Optional<Integer> getIntegerFromString(String string){
		try {
			return Optional.of(Integer.parseInt(string));
		}
		catch(NumberFormatException e) {
			return Optional.empty();
		}
	}

}
