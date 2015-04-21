package br.com.videoconverter.videoconverter.bo.encoder.enconding.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetStatusResponse extends Response {

	@XmlElement(name="id")
	private String id;
	
	@XmlElement(name="userid")
	private String userId;
	
	@XmlElement(name="sourcefile")
	private String sourceFile;
	
	@XmlElement(name="status")
	private String status;
	
	@XmlElement(name="notifyurl")
	private String notifyUrl;
	
	@XmlElement(name="created")
	private String created;
	
	@XmlElement(name="started")
	private String started;
	
	@XmlElement(name="finished")
	private String finished;
	
	@XmlElement(name="prevstatus")
	private String prevStatus;
	
	@XmlElement(name="downloaded")
	private String downloaded;
	
	@XmlElement(name="uploaded")
	private String uploaded;
	
	@XmlElement(name="time_left")
	private String timeLeft;
	
	@XmlElement(name="progress")
	private String progress;
	
	@XmlElement(name="time_left_current")
	private String timeLeftCurrent;
	
	@XmlElement(name="progress_current")
	private String progressCurrent;
	
	@XmlElement(name="format")
	private List<Format> format;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getStarted() {
		return started;
	}

	public void setStarted(String started) {
		this.started = started;
	}

	public String getFinished() {
		return finished;
	}

	public void setFinished(String finished) {
		this.finished = finished;
	}

	public String getPrevStatus() {
		return prevStatus;
	}

	public void setPrevStatus(String prevStatus) {
		this.prevStatus = prevStatus;
	}

	public String getDownloaded() {
		return downloaded;
	}

	public void setDownloaded(String downloaded) {
		this.downloaded = downloaded;
	}

	public String getUploaded() {
		return uploaded;
	}

	public void setUploaded(String uploaded) {
		this.uploaded = uploaded;
	}

	public String getTimeLeft() {
		return timeLeft;
	}

	public void setTimeLeft(String timeLeft) {
		this.timeLeft = timeLeft;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getTimeLeftCurrent() {
		return timeLeftCurrent;
	}

	public void setTimeLeftCurrent(String timeLeftCurrent) {
		this.timeLeftCurrent = timeLeftCurrent;
	}

	public String getProgressCurrent() {
		return progressCurrent;
	}

	public void setProgressCurrent(String progressCurrent) {
		this.progressCurrent = progressCurrent;
	}

	public List<Format> getFormat() {
		return format;
	}

	public void setFormat(List<Format> format) {
		this.format = format;
	}
	
	
}
