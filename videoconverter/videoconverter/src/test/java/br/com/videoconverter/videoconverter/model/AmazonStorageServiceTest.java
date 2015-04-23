package br.com.videoconverter.videoconverter.model;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.junit.Test;

public class AmazonStorageServiceTest {

	@Test
	public void testStoreFile() throws StorageException, IOException {
		AmazonStorageService storageService = new AmazonStorageService();
		String fileName = "/test.txt";
		InputStream is = this.getClass().getResourceAsStream(fileName);
		assertNotNull(is);
		String url = storageService.storeFile(is, fileName);
		assertNotNull(url);
		URL remoteFile = new URL(url);
		InputStream obj = remoteFile.openConnection().getInputStream();
		assertNotNull(obj);
		is.close();
		obj.close();
		
		try {
			storageService.storeFile(null, fileName);
			fail("An exception was expected for null content");
		} catch (StorageException ex) {
			// It should pass here
		}
		
		try {
			storageService.storeFile(null, null);
			fail("An exception was expected for null name");
		} catch (StorageException ex) {
			// It should pass here
		}
	}

}
