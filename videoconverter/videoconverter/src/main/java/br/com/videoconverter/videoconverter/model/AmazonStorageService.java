package br.com.videoconverter.videoconverter.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;

/**
 * Classe para lidar com o serviço de storage da Amazon.
 * @author maycon
 *
 */
public class AmazonStorageService implements Serializable {
	
	private static final long serialVersionUID = -3591471860359568059L;
	
	private static final String BUCKET_NAME = "mayconcosta";
	private AmazonS3 s3client = new AmazonS3Client(new ProfileCredentialsProvider());
	
	public String storeFile(InputStream file, String name) throws StorageException {
		try {
			String keyName = name;
			ObjectMetadata metadata = new ObjectMetadata();
			metadata.setHeader("x-amz-acl", "public-read");
			PutObjectRequest request = new PutObjectRequest(BUCKET_NAME, keyName, file, metadata);
			PutObjectResult result = s3client.putObject(request);
			return "https://" + BUCKET_NAME + ".s3.amazonaws.com/" + name;

		} catch (AmazonServiceException ase) {
			System.err.println("Error Message:    " + ase.getMessage());
			System.err.println("HTTP Status Code: " + ase.getStatusCode());
			System.err.println("AWS Error Code:   " + ase.getErrorCode());
			System.err.println("Error Type:       " + ase.getErrorType());
			System.err.println("Request ID:       " + ase.getRequestId());

		} catch (AmazonClientException ace) {
			System.err.println("Error Message: " + ace.getMessage());

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		try {
			AmazonStorageService s3 = new AmazonStorageService();
			File file = new File("/home/maycon/teste/test.txt");
			InputStream is = new FileInputStream(file);
			s3.storeFile(is, file.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
