package br.com.videoconverter.videoconverter.bo.encoder.enconding.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class TextOverlay {

	@XmlElement(name="text")
	private String text;
	
	@XmlElement(name="font_source")
	private String 	fontSource;
	
	@XmlElement(name="font_size")
	private String fontSize;
	
	@XmlElement(name="font_rotate")
	private String fontRotate;
	
	@XmlElement(name="font_color")
	private String fontColor;
	
	@XmlElement(name="align_center")
	private String alignCenter;
	
	@XmlElement(name="overlay_x")
	private String overlayX;
	
	@XmlElement(name="overlay_y")
	private String overlayY;
	
	@XmlElement(name="size")
	private String size;
	
	@XmlElement(name="start")
	private String start;
	
	@XmlElement(name="duration")
	private long duration;
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getFontSource() {
		return fontSource;
	}
	public void setFontSource(String fontSource) {
		this.fontSource = fontSource;
	}
	public String getFontSize() {
		return fontSize;
	}
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}
	public String getFontRotate() {
		return fontRotate;
	}
	public void setFontRotate(String fontRotate) {
		this.fontRotate = fontRotate;
	}
	public String getFontColor() {
		return fontColor;
	}
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	public String getAlignCenter() {
		return alignCenter;
	}
	public void setAlignCenter(String alignCenter) {
		this.alignCenter = alignCenter;
	}
	public String getOverlayX() {
		return overlayX;
	}
	public void setOverlayX(String overlayX) {
		this.overlayX = overlayX;
	}
	public String getOverlayY() {
		return overlayY;
	}
	public void setOverlayY(String overlayY) {
		this.overlayY = overlayY;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	
}
