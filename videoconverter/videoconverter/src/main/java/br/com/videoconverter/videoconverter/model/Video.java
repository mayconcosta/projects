package br.com.videoconverter.videoconverter.model;

import java.io.Serializable;



public class Video implements Serializable {

	private static final long serialVersionUID = 197173738576936784L;
	
	private String sourceUrl;
	private String convertedUrl;
	private String id;
	private String name;
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
