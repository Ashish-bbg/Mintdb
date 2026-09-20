package com.ashish.mintdb.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Storage {
	
 	private final Path filePath  = Path.of("data", "mint.db");
 	
 	public void append(String data) throws IOException {
 		Files.createDirectories(filePath.getParent());
 		Files.writeString(
 				filePath,
 				data + System.lineSeparator(),
 				StandardOpenOption.CREATE,
 				StandardOpenOption.APPEND
 				);
 	}
 	
 	public String read() throws IOException {
 		
 		if(!Files.exists(filePath)) {
 			return "";
 		}
 		
 		return Files.readString(filePath);
 	}

}
