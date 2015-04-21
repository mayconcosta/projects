package br.com.videoconverter.videoconverter.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.BasicAWSCredentials;
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
	//private AmazonS3 s3client = new AmazonS3Client(new ProfileCredentialsProvider());
	private AmazonS3 s3client = new AmazonS3Client(new BasicAWSCredentials("AKIAIIFNQMGTTTLY6NSQ", "5XjJyD/v5Jqyk/9rE4WR2arDHeJhx+LyBTP9k+sk"));
	
	public String storeFile(InputStream file, String name) throws StorageException {
		try {
			
			/**
			String keyName = name;
			ObjectMetadata metadata = new ObjectMetadata();
			metadata.setHeader("x-amz-acl", "public-read");
			PutObjectRequest request = new PutObjectRequest(BUCKET_NAME, keyName, file, metadata);
			PutObjectResult result = s3client.putObject(request);
			*/
			Thread.sleep(4000);
			return "https://" + BUCKET_NAME + ".s3.amazonaws.com/" + name;

		} catch (AmazonServiceException ase) {
			System.out.println("Caught an AmazonServiceException, which " +
					"means your request made it " +
					"to Amazon S3, but was rejected with an error response" +
					" for some reason.");
			System.out.println("Error Message:    " + ase.getMessage());
			System.out.println("HTTP Status Code: " + ase.getStatusCode());
			System.out.println("AWS Error Code:   " + ase.getErrorCode());
			System.out.println("Error Type:       " + ase.getErrorType());
			System.out.println("Request ID:       " + ase.getRequestId());

		} catch (AmazonClientException ace) {
			System.out.println("Caught an AmazonClientException, which " +
					"means the client encountered " +
					"an internal error while trying to " +
					"communicate with S3, " +
					"such as not being able to access the network.");
			System.out.println("Error Message: " + ace.getMessage());

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
