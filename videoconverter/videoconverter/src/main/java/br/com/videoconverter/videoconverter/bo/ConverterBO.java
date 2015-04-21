package br.com.videoconverter.videoconverter.bo;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.videoconverter.videoconverter.bo.encoder.zencoder.Zencoder;
import br.com.videoconverter.videoconverter.model.Video;

import com.brightcove.zencoder.client.response.ZencoderCreateJobResponse;
import com.brightcove.zencoder.client.response.ZencoderJobDetail;

/**
 * Classe de negócio para fazer a lógica de conversão de vídeo.
 * @author maycon
 *
 */
@Named
@ApplicationScoped
public class ConverterBO implements Serializable {
	
	private static final long serialVersionUID = 6096773345754626713L;
	
	@Inject
	private Zencoder encoderService;
	
	public Video convert(Video video) {
		ZencoderCreateJobResponse response = this.encoderService.addVideo(video);
		String jobId = response.getId();
		video.setId(jobId);
		return video;
	}
	
	public void cancelConversion(Video video) {
		this.encoderService.cancelVideo(video);
	}
	
	public boolean isConversionComplete(Video video) {
		ZencoderJobDetail detail = this.encoderService.getVideoInfo(video);
		detail.getOutputMediaFiles().get(0).getUrl();
		return detail.getFinishedAt() != null;
	}
	
	public String getConvertedUrl(Video video) {
		ZencoderJobDetail detail = this.encoderService.getVideoInfo(video);
		if (detail.getFinishedAt() != null) {
			return detail.getOutputMediaFiles().get(0).getUrl();
		}
		return null;
	}

}
