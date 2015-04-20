package br.com.videoconverter.videoconverter.model;

import org.hibernate.validator.constraints.NotEmpty;


public class Video {

	@NotEmpty
	private String sourceUrl;
	private String convertedUrl;
	private String id;
	
	@NotEmpty
	private VideoFormat format;
	
	
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourcelUrl(String originalUrl) {
		this.sourceUrl = originalUrl;
	}

	public String getConvertedUrl() {
		return convertedUrl;
	}

	public void setConvertedUrl(String convertedUrl) {
		this.convertedUrl = convertedUrl;
	}

	public VideoFormat getFormat() {
		return format;
	}
	
	public void setFormat(VideoFormat format) {
		this.format = format;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

}
