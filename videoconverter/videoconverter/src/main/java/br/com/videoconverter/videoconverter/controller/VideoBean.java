package br.com.videoconverter.videoconverter.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.videoconverter.videoconverter.bo.ConverterBO;
import br.com.videoconverter.videoconverter.model.Video;
import br.com.videoconverter.videoconverter.model.VideoFormat;

@Named(value="video")
@SessionScoped
public class VideoBean implements Serializable {
	
	private static final long serialVersionUID = -7071068785827925088L;

	private Video video = new Video();
	
	@Inject
	private ConverterBO converterBO;
	
	public Video getVideo() {
		return video;
	}
	
	public void setVideo(Video video) {
		this.video = video;
	}
	
	public String convertVideo() {
		this.setVideo(this.converterBO.convert(getVideo()));
		return null;
	}
	
	public VideoFormat [] getVideoFormatList() {
		return VideoFormat.values();
	}
}
