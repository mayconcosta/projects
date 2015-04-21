package br.com.videoconverter.videoconverter.bo.encoder.enconding.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class SplitScreen {

	@XmlElement(name="columns")
	private String columns;
	
	@XmlElement(name="rows")
	private String rows;
	
	@XmlElement(name="padding_left")
	private String paddingLeft;
	
	@XmlElement(name="padding_right")
	private String paddingRight;
	
	@XmlElement(name="padding_top")
	private String paddingTop;
	
	@XmlElement(name="padding_bottom")
	private String paddingBottom;
	
	
	public String getColumns() {
		return columns;
	}
	public void setColumns(String columns) {
		this.columns = columns;
	}
	public String getRows() {
		return rows;
	}
	public void setRows(String rows) {
		this.rows = rows;
	}
	public String getPaddingLeft() {
		return paddingLeft;
	}
	public void setPaddingLeft(String paddingLeft) {
		this.paddingLeft = paddingLeft;
	}
	public String getPaddingRight() {
		return paddingRight;
	}
	public void setPaddingRight(String paddingRight) {
		this.paddingRight = paddingRight;
	}
	public String getPaddingTop() {
		return paddingTop;
	}
	public void setPaddingTop(String paddingTop) {
		this.paddingTop = paddingTop;
	}
	public String getPaddingBottom() {
		return paddingBottom;
	}
	public void setPaddingBottom(String paddingBottom) {
		this.paddingBottom = paddingBottom;
	}
	
	
}
