package br.com.videoconverter.videoconverter;

import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="video")
@SessionScoped
public class VideoBean {
	private Video video = new Video();
	
	
	public Video getVideo() {
		return video;
	}
	
	public void setVideo(Video video) {
		this.video = video;
	}
	
	public String convertVideo() {
		this.getVideo().setConvertedUrl(this.getVideo().getOriginalUrl());
		return null;
	}
	
	public VideoFormat [] getVideoFormatList() {
		return VideoFormat.values();
	}
}
