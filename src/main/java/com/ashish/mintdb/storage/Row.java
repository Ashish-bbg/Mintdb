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
	
	public boolean isValid(TableSchema schema) {
		
		if(values.size() != schema.getColumns().size()) {
			return false;
		}
		
		for(int i=0; i<values.size(); i++) {
			Object value = values.get(i);
			DataType expectedType = schema.getColumns().get(i).getType();
			
			if(!expectedType.isValid(value)) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public String serialize() {
		return values.stream()
				.map(Object::toString)
				.reduce((a,b) -> a + "|" + b)
				.orElse("");
	}
	
}








