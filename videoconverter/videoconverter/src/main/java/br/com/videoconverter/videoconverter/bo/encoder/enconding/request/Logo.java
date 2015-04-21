package br.com.videoconverter.videoconverter.bo.encoder.enconding.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Logo {

	@XmlElement(name="logo_source")
	private String logoSource;
	
	@XmlElement(name="logo_x")
	private String logoX;
	
	@XmlElement(name="logo_y")
	private String logoY;
	
	@XmlElement(name="logo_mode")
	private String logoMode;
	
	@XmlElement(name="logo_threshold")
	private String logoThreshold;
	
	public String getLogoSource() {
		return logoSource;
	}
	public void setLogoSource(String logoSource) {
		this.logoSource = logoSource;
	}
	public String getLogoX() {
		return logoX;
	}
	public void setLogoX(String logoX) {
		this.logoX = logoX;
	}
	public String getLogoY() {
		return logoY;
	}
	public void setLogoY(String logoY) {
		this.logoY = logoY;
	}
	public String getLogoMode() {
		return logoMode;
	}
	public void setLogoMode(String logoMode) {
		this.logoMode = logoMode;
	}
	public String getLogoThreshold() {
		return logoThreshold;
	}
	public void setLogoThreshold(String logoThreshold) {
		this.logoThreshold = logoThreshold;
	}
}
