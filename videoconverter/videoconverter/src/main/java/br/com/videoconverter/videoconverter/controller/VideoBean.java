package br.com.videoconverter.videoconverter.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;

import br.com.videoconverter.videoconverter.bo.ConverterBO;
import br.com.videoconverter.videoconverter.model.Video;
import br.com.videoconverter.videoconverter.model.VideoFormat;

@Named(value = "video")
@SessionScoped
public class VideoBean implements Serializable {

	private static final long serialVersionUID = -7071068785827925088L;

	@Inject
	private ConverterBO converterBO;

	private Video video = new Video();
	private Part file;

	public String convertVideo() {
		this.setVideo(this.converterBO.convert(this.getVideo()));
		return null;
	}

	public String updateVideo() {
		this.getVideo().setConvertedUrl(this.converterBO.getConvertedUrl(this.getVideo()));
		return null;
	}

	public VideoFormat[] getVideoFormatList() {
		return VideoFormat.values();
	}

	public String upload() {
		try {
			String fileUrl = this.converterBO.storeFile(file.getInputStream(), file.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}
}
