package br.com.videoconverter.videoconverter.bo.encoder.enconding.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="query")
@XmlAccessorType(XmlAccessType.FIELD)
public class Query {

	@XmlElement(name="userid")
	private String userId;
	
	@XmlElement(name="userkey")
	private String userKey;
	
	@XmlElement(name="action")
	private Action action;
	
	@XmlElement(name="mediaid")
	private String mediaId;
	
	@XmlElement(name="source")
	private List<String> sourceList;
	
	@XmlElement(name="split_screen")
	private SplitScreen splitScreen;
	
	@XmlElement(name="region")
	private Region region;
	
	@XmlElement(name="notify_format")
	private NotifyFormat notifyFormat;
	
	@XmlElement(name="notify")
	private String notify;
	
	@XmlElement(name="notity_encoding_erros")
	private String notifyEncodingErrors;
	
	@XmlElement(name="notify_upload")
	private String notifyUpload;
	
	@XmlElement(name="format")
	private Format format;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserKey() {
		return userKey;
	}
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public List<String> getSourceList() {
		return sourceList;
	}
	public void setSourceList(List<String> sourceList) {
		this.sourceList = sourceList;
	}
	public SplitScreen getSplitScreen() {
		return splitScreen;
	}
	public void setSplitScreen(SplitScreen splitScreen) {
		this.splitScreen = splitScreen;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public NotifyFormat getNotifyFormat() {
		return notifyFormat;
	}
	public void setNotifyFormat(NotifyFormat notifyFormat) {
		this.notifyFormat = notifyFormat;
	}
	public String getNotify() {
		return notify;
	}
	public void setNotify(String notify) {
		this.notify = notify;
	}
	public String getNotifyEncodingErrors() {
		return notifyEncodingErrors;
	}
	public void setNotifyEncodingErrors(String notifyEncodingErrors) {
		this.notifyEncodingErrors = notifyEncodingErrors;
	}
	public String getNotifyUpload() {
		return notifyUpload;
	}
	public void setNotifyUpload(String notifyUpload) {
		this.notifyUpload = notifyUpload;
	}
	public Format getFormat() {
		return format;
	}
	public void setFormat(Format format) {
		this.format = format;
	}
	
	public void addSource(String source) {
		if (this.getSourceList() == null) {
			this.setSourceList(new ArrayList<String>());
		}
		this.getSourceList().add(source);
	}
	
	
}
