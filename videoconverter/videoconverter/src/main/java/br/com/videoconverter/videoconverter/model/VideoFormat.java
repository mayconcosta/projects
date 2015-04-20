package br.com.videoconverter.videoconverter.model;

public enum VideoFormat {
	MP4("mp4"),
	WebM("webm"),
	Ogg("ogg");
	
	private String name;
	private VideoFormat(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
