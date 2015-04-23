package br.com.videoconverter.videoconverter.model;

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
	
	public String storeFile(InputStream is, String name) throws StorageException {
		if (is == null || name == null) {
			throw new StorageException("File name our content can not be null");
		}
		
		try {
			String keyName = name;
			ObjectMetadata metadata = new ObjectMetadata();
			metadata.setHeader("x-amz-acl", "public-read");
			PutObjectRequest request = new PutObjectRequest(BUCKET_NAME, keyName, is, metadata);
			PutObjectResult result = s3client.putObject(request);
			return "https://" + BUCKET_NAME + ".s3.amazonaws.com/" + name;

		} catch (AmazonServiceException ase) {
			System.err.println("Error Message:    " + ase.getMessage());
			System.err.println("AWS Error Code:   " + ase.getErrorCode());
			System.err.println("Error Type:       " + ase.getErrorType());
			System.err.println("Request ID:       " + ase.getRequestId());
			throw new StorageException(ase);

		} catch (AmazonClientException ace) {
			System.err.println("Error Message: " + ace.getMessage());
			throw new StorageException(ace);

		} catch (Exception ex) {
			throw new StorageException(ex);
		}
	}
	
}
