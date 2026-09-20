package com.ashish.mintdb.storage;

public enum DataType {
	
	INT,
	TEXT;
	
	public boolean isValid(Object value) {
		
		if(value == null) {
			return true;
		}
		
		return switch(this) {
		case INT -> value instanceof Integer;
		case TEXT -> value instanceof String;
		};
	}

}
