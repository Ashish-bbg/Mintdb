package com.ashish.mintdb.storage;

import java.util.ArrayList;
import java.util.List;

public class Row {

	private List<Object> values;
	
	public Row() {
		values = new ArrayList<>();
	}
	
	public void addValue(Object value) {
		values.add(value);
	}
	
	public Object getValue(int index) {
		return values.get(index);
	}
	
	public List<Object> getValues(){
		return values;
	}
	
}
