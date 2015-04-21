package br.com.videoconverter.videoconverter.bo.encoder.enconding.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetMediaInfoResponse extends Response {

	@XmlElement(name="bitrate")
	private String bitRate;
	
	@XmlElement(name="duration")
	private String duration;
	
	@XmlElement(name="audio_bitrate")
	private String audioBitRate;
	
	@XmlElement(name="video_codec")
	private String videoCodec;
	
	@XmlElement(name="video_bitrate")
	private String videoBitRate;
	
	@XmlElement(name="frame_rate")
	private String frameRate;
	
	@XmlElement(name="size")
	private String size;
	
	@XmlElement(name="pixel_aspect_ratio")
	private String pixeAspectRatio;
	
	@XmlElement(name="display_aspect_ratio")
	private String displayAspectRatio;
	
	@XmlElement(name="audio_codec")
	private String audioCodec;
	
	@XmlElement(name="audio_sample_rate")
	private String audioSampleRate;
	
	@XmlElement(name="audio_channels")
	private String audioChannels;

	public String getBitRate() {
		return bitRate;
	}

	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getAudioBitRate() {
		return audioBitRate;
	}

	public void setAudioBitRate(String audioBitRate) {
		this.audioBitRate = audioBitRate;
	}

	public String getVideoCodec() {
		return videoCodec;
	}

	public void setVideoCodec(String videoCodec) {
		this.videoCodec = videoCodec;
	}

	public String getVideoBitRate() {
		return videoBitRate;
	}

	public void setVideoBitRate(String videoBitRate) {
		this.videoBitRate = videoBitRate;
	}

	public String getFrameRate() {
		return frameRate;
	}

	public void setFrameRate(String frameRate) {
		this.frameRate = frameRate;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPixeAspectRatio() {
		return pixeAspectRatio;
	}

	public void setPixeAspectRatio(String pixeAspectRatio) {
		this.pixeAspectRatio = pixeAspectRatio;
	}

	public String getDisplayAspectRatio() {
		return displayAspectRatio;
	}

	public void setDisplayAspectRatio(String displayAspectRatio) {
		this.displayAspectRatio = displayAspectRatio;
	}

	public String getAudioCodec() {
		return audioCodec;
	}

	public void setAudioCodec(String audioCodec) {
		this.audioCodec = audioCodec;
	}

	public String getAudioSampleRate() {
		return audioSampleRate;
	}

	public void setAudioSampleRate(String audioSampleRate) {
		this.audioSampleRate = audioSampleRate;
	}

	public String getAudioChannels() {
		return audioChannels;
	}

	public void setAudioChannels(String audioChannels) {
		this.audioChannels = audioChannels;
	}
}
