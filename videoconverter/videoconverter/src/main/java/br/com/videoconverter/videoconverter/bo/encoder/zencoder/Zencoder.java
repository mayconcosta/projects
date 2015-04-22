package br.com.videoconverter.videoconverter.bo.encoder.zencoder;

import java.util.ArrayList;
import java.util.List;

import br.com.videoconverter.videoconverter.model.Video;

import com.brightcove.zencoder.client.ZencoderClient;
import com.brightcove.zencoder.client.ZencoderClientException;
import com.brightcove.zencoder.client.model.ContainerFormat;
import com.brightcove.zencoder.client.request.ZencoderCreateJobRequest;
import com.brightcove.zencoder.client.request.ZencoderOutput;
import com.brightcove.zencoder.client.response.ZencoderCreateJobResponse;
import com.brightcove.zencoder.client.response.ZencoderJobDetail;

/**
 * Classe para comunicação com o serviço de codificação de vídeo Zencoder.
 * @author maycon
 *
 */
public class Zencoder {

	private static final String AMAZON_S3_BUCKET = "s3://mayconcosta";
	private static final String API_KEY = "719230ea1a83818e09e08a8975a482d7";
	private ZencoderClient zencoderClient = new ZencoderClient(API_KEY);

	public ZencoderCreateJobResponse addVideo(Video video) {
		try {
			ZencoderOutput output = new ZencoderOutput();
			output.setFormat(ContainerFormat.valueOf(video.getFormat().name().toUpperCase()));
			output.setUrl(AMAZON_S3_BUCKET + "/" + System.currentTimeMillis() + "." + video.getFormat().getName());
			output.setPublic(true);
			
			List<ZencoderOutput> outputs = new ArrayList<ZencoderOutput>();
			outputs.add(output);
			
			ZencoderCreateJobRequest job = new ZencoderCreateJobRequest();
			job.setInput(video.getSourceUrl());
			job.setOutputs(outputs);
			job.setTest(true);
			
			ZencoderCreateJobResponse response = zencoderClient.createZencoderJob(job);
			return response;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Object cancelVideo(Video video) {
		try {
			if (video.getId() != null) {
				this.zencoderClient.cancelJob(video.getId());
			}
		} catch (ZencoderClientException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ZencoderJobDetail getVideoInfo(Video video) {
		try {
			String jobId = video.getId();
			if (jobId != null) {
				return this.zencoderClient.getZencoderJob(jobId);
				
			}
			
		} catch (ZencoderClientException e) {
			e.printStackTrace();
		}
		return null;
	}
}
