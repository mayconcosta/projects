package br.com.videoconverter.videoconverter.bo.encoder.enconding.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType
public enum ForceInterlaced {
	tff,
	bff,
	no
}
