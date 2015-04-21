package br.com.videoconverter.videoconverter.bo.encoder.enconding.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Format {
	
	@XmlElement(name="id")
	private String id;
		
	@XmlElement(name="status")
	private String status;
	
	@XmlElement(name="created")
	private String created;
	
	@XmlElement(name="started")
	private String started;
	
	@XmlElement(name="finished")
	private String finished;
	
	@XmlElement(name="s3_destination")
	private String s3Destination;
	
	@XmlElement(name="cf_destination")
	private String cfDestination;
	
	@XmlElement(name="destination")
	private List<String> destinationList;
	
	@XmlElement(name="destination_status")
	private List<String> destinationStatusList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getS3Destination() {
		return s3Destination;
	}

	public void setS3Destination(String s3Destination) {
		this.s3Destination = s3Destination;
	}

	public String getCfDestination() {
		return cfDestination;
	}

	public void setCfDestination(String cfDestination) {
		this.cfDestination = cfDestination;
	}

	public List<String> getDestinationList() {
		return destinationList;
	}

	public void setDestinationList(List<String> destinationList) {
		this.destinationList = destinationList;
	}

	public List<String> getDestinationStatusList() {
		return destinationStatusList;
	}

	public void setDestinationStatusList(List<String> destinationStatusList) {
		this.destinationStatusList = destinationStatusList;
	}
	
}
