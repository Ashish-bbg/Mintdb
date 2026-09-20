package com.ashish.mintdb.storage;

import java.util.ArrayList;
import java.util.List;

public class TableSchema {

	private List<Column> columns = new ArrayList<>();
	
	public void addColumn(Column column) {
		columns.add(column);
	}
	
	public List<Column> getColumns(){
		return columns;
	}
}
