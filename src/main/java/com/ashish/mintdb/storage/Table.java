package com.ashish.mintdb.storage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Table {

	private String name;
	private TableSchema schema;
	private List<Row> rows;
	private Storage storage;
	
	public Table(String name, TableSchema schema) {
		this.name = name;
		this.schema = schema;
		this.rows = new ArrayList<>();
		this.storage = new Storage();
	}
	
	public void insert(Object... values) throws IOException {
		
		Row row = new Row();
		
		for(Object value: values) {
			row.addValue(value);
		}
		
		if(!row.isValid(schema)) {
			throw new IllegalArgumentException("Invalid row");
		}
		
		rows.add(row);
		
		storage.append(row.serialize());
		
	}
	
	public List<Row> getRows(){
		return rows;
	}
	
	public String getName() {
		return name;
	}
	
	public TableSchema getSchema() {
		return schema;
	}
}
