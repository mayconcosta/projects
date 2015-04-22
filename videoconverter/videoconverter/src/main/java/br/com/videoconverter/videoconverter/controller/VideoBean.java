package br.com.videoconverter.videoconverter.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;

import br.com.videoconverter.videoconverter.bo.ConverterBO;
import br.com.videoconverter.videoconverter.model.AmazonStorageService;
import br.com.videoconverter.videoconverter.model.Video;
import br.com.videoconverter.videoconverter.model.VideoFormat;

/**
 * Controlador para a tela de conversão de vídeos.
 * @author maycon
 *
 */
@Named(value = "video")
@SessionScoped
public class VideoBean implements Serializable {

	private static final long serialVersionUID = -7071068785827925088L;

	@Inject
	private ConverterBO converterBO;

	@Inject
	private AmazonStorageService amazonStorageService;

	private Video video = new Video();
	private Part file;

	/**
	 * Método para realizar a conversão de vídeo.
	 * @return
	 */
	public String convertVideo() {
		this.setVideo(this.converterBO.convert(this.getVideo()));
		return null;
	}

	/**
	 * Verifica se a conversão já foi finalizada e, caso afirmativo, atualiza a URL para o vídeo convertido.
	 * @return
	 */
	public String updateVideo() {
		try {
			String convertedVideoUrl = this.converterBO.getConvertedUrl(this.getVideo());
			this.getVideo().setConvertedUrl(convertedVideoUrl);

			if (this.getVideo().getConvertedUrl() != null) {
				FacesContext.getCurrentInstance().getExternalContext().redirect("player.faces");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public VideoFormat[] getVideoFormatList() {
		return VideoFormat.values();
	}

	/**
	 * Realiza o upload de um arquivo no serviço de armazenamento da Amazon.
	 * @return
	 */
	public String upload() {
		try {
			String fileUrl = this.amazonStorageService.storeFile(file.getInputStream(), this.getFileName(file));
			this.getVideo().setSourceUrl(fileUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Solicita a ação de cancelamento de um job de conversão que esteja em andamento.
	 * @return
	 */
	public String cancelConversion() {
		try {
			this.converterBO.cancelConversion(getVideo());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return this.reload();
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

	public String reload() {
		this.setVideo(new Video());
		this.setFile(null);
		return "home.faces?faces-redirect=true";
	}

	private String getFileName(Part part) {
		final String partHeader = part.getHeader("content-disposition");
		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename")) {
				return content.substring(content.indexOf('=') + 1).trim()
						.replace("\"", "");
			}
		}
		return null;
	}
}
