package com.ashish.mintdb.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Storage {
	
 	private final Path filePath  = Path.of("data", "mint.db");
 	
 	public void write(String data) throws IOException {
 		Files.createDirectories(filePath.getParent());
 		Files.writeString(filePath, data);
 	}
 	
 	public String read() throws IOException {
 		return Files.readString(filePath);
 	}

}
