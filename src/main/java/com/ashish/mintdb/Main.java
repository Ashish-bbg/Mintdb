package com.ashish.mintdb;

import com.ashish.mintdb.storage.Column;
import com.ashish.mintdb.storage.DataType;
import com.ashish.mintdb.storage.Row;
import com.ashish.mintdb.storage.Storage;
import com.ashish.mintdb.storage.Table;
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

		Table users = new Table("users", schema);
		
		users.insert(1, "Ashish", 23);
		users.insert(2, "Rahul", 24);
		
		for(Row row: users.getRows()) {
			System.out.println(row.getValues());
		}
	}

}
