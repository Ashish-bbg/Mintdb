package com.ashish.mintdb;

import com.ashish.mintdb.storage.Column;
import com.ashish.mintdb.storage.DataType;
import com.ashish.mintdb.storage.Row;
import com.ashish.mintdb.storage.Storage;
import com.ashish.mintdb.storage.TableSchema;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Our database has started!");
		
//		Storage storage = new Storage();
//		
////		storage.write("Ashish,25");
//		
//		String data = storage.read();
//		
//		System.out.println(data);
		
//		Row row = new Row(1, "Ashish", 25);
//		
//		System.out.println(row.getId());
//		System.out.println(row.getName());
//		System.out.println(row.getAge());
		
		TableSchema schema = new TableSchema();
		
		schema.addColumn(new Column("id", DataType.INT));
		schema.addColumn(new Column("name", DataType.TEXT));
		schema.addColumn(new Column("age", DataType.INT));
		
		for(Column column : schema.getColumns()) {
			System.out.println(
					column.getName() + " -> " + column.getType()
					);
		}
		
	}

}
