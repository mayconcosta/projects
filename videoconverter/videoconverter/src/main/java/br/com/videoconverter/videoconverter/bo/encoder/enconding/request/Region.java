package br.com.videoconverter.videoconverter.bo.encoder.enconding.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType
public enum Region {
	@XmlEnumValue("us-east-1")
	us_east_1,
	
	@XmlEnumValue("us-west-")
	us_west_1,
	
	@XmlEnumValue("us-west-2")
	us_west_2,
	
	@XmlEnumValue("eu-west-1")
	eu_west_1,
	
	@XmlEnumValue("ap-southeast-1")
	ap_southeast_1,
	
	@XmlEnumValue("ap-southeast-2")
	ap_southeast_2,
	
	@XmlEnumValue("ap-northeast-1")
	ap_northeast_1,
	
	@XmlEnumValue("sa-east-1")
	sa_east_1;
	
}
