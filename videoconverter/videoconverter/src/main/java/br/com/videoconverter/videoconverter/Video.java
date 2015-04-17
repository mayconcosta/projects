package br.com.videoconverter.videoconverter;

public class Video {
	
	private String originalUrl;
	private String convertedUrl;
	private VideoFormat format;
	
	
	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
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
	
	

}
