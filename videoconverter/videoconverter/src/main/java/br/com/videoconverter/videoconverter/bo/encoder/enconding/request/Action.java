package br.com.videoconverter.videoconverter.bo.encoder.enconding.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType
public enum Action {
	AddMedia,
	AddMediaBenchmark,
	UpdateMedia,
	ProcessMedia,
	CancelMedia,
	GetMediaList,
	GetStatus,
	GetMediaInfo,
	GetMediaInfoEx,
	RestartMedia,
	RestartMediaErrors,
	RestartMediaTask,
	StopMedia
}
