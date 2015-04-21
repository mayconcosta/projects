package br.com.videoconverter.videoconverter.model;

import org.hibernate.validator.constraints.NotEmpty;


public class Video {

	@NotEmpty
	private String sourceUrl;
	private String convertedUrl;
	private String id;
	private String name;
	
	@NotEmpty
	private VideoFormat format = VideoFormat.MP4;
	
	
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
