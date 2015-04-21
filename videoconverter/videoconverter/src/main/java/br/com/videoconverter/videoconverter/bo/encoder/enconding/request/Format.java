package br.com.videoconverter.videoconverter.bo.encoder.enconding.request;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Format {

	@XmlElement(name="noise_reduction")
	private String noiseReduction;
	
	@XmlElement(name="output")
	private String output;
	
	@XmlElement(name="video_codec")
	private String videoCodec;
	
	@XmlElement(name="audio_codec")
	private String audioCodec;
	
	@XmlElement(name="bitrate")
	private String bitRate;
	
	@XmlElement(name="audio_sample_rate")
	private String audioSampleRate;
	
	@XmlElement(name="adio_channels_number")
	private String audioChannelsNamber;
	
	@XmlElement(name="audio_volume")
	private String audioVolume;
	
	@XmlElement(name="audio_normalization")
	private String audioNormalization;
	
	@XmlElement(name="framerate")
	private String frameRate;
	
	@XmlElement(name="framerate_upper_threshold")
	private String frameRateUpperThreshold;
	
	@XmlElement(name="size")
	private String size;
	
	@XmlElement(name="fade_in")
	private String fadeIn;
	
	@XmlElement(name="fade_out")
	private String fadeOut;
	
	@XmlElement(name="crop_left")
	private String cropLeft;
	
	@XmlElement(name="crop_right")
	private String cropRight;
	
	@XmlElement(name="crop_top")
	private String cropTop;
	
	@XmlElement(name="crop_bottom")
	private String cropBottom;
	
	@XmlElement(name="keep_aspect_ratio")
	private KeepAspectRatio keepAspectRatio;
	
	@XmlElement(name="Hint")
	private Hint hint;
	
	@XmlElement(name="rc_init_occupancy")
	private String rcInitOccupancy;
	
	@XmlElement(name="minrate")
	private String minRate;
	
	@XmlElement(name="maxrate")
	private String maxRate;
	
	@XmlElement(name="bufsize")
	private String bufSize;
	
	@XmlElement(name="keyframe")
	private String keyFrame;
	
	@XmlElement(name="start")
	private String start;
	
	@XmlElement(name="duration")
	private String duration;
	
	@XmlElement(name="force_key_frame")
	private String forceKeyFrame;
	
	@XmlElement(name="bf_frames")
	private String bfFrames;
	
	@XmlElement(name="gop")
	private Gop gop;
	
	@XmlElement(name="metadata")
	private Metadata metadata;
	
	@XmlElement(name="destination")
	private List<String> destinationList;
	
	@XmlElement(name="logo")
	private Logo logo;
	
	@XmlElement(name="overlay")
	private List<Overlay> overlayList;
	
	@XmlElement(name="text_overlay")
	private List<TextOverlay> textOverlayList;
	
	@XmlElement(name="video_codec_paratemer")
	private String videoCodecParameter;
	
	@XmlElement(name="profile")
	private Profile profile;
	
	@XmlElement(name="turbo")
	private Turbo turbo;
	
	@XmlElement(name="rotate")
	private String rotate;
	
	@XmlElement(name="set_rotate")
	private String setRotate;
	
	@XmlElement(name="audio_sync")
	private String audioSync;
	
	@XmlElement(name="video_sync")
	private VideoSync videoSync;
	
	@XmlElement(name="force_interlaced")
	private ForceInterlaced forceInterlaced;
	
	@XmlElement(name="strip_chapters")
	private StripChapters stripChapters;
	
	public String getNoiseReduction() {
		return noiseReduction;
	}
	public void setNoiseReduction(String noiseReduction) {
		this.noiseReduction = noiseReduction;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getVideoCodec() {
		return videoCodec;
	}
	public void setVideoCodec(String videoCodec) {
		this.videoCodec = videoCodec;
	}
	public String getAudioCodec() {
		return audioCodec;
	}
	public void setAudioCodec(String audioCodec) {
		this.audioCodec = audioCodec;
	}
	public String getBitRate() {
		return bitRate;
	}
	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
	}
	public String getAudioSampleRate() {
		return audioSampleRate;
	}
	public void setAudioSampleRate(String audioSampleRate) {
		this.audioSampleRate = audioSampleRate;
	}
	public String getAudioChannelsNamber() {
		return audioChannelsNamber;
	}
	public void setAudioChannelsNamber(String audioChannelsNamber) {
		this.audioChannelsNamber = audioChannelsNamber;
	}
	public String getAudioVolume() {
		return audioVolume;
	}
	public void setAudioVolume(String audioVolume) {
		this.audioVolume = audioVolume;
	}
	public String getAudioNormalization() {
		return audioNormalization;
	}
	public void setAudioNormalization(String audioNormalization) {
		this.audioNormalization = audioNormalization;
	}
	public String getFrameRate() {
		return frameRate;
	}
	public void setFrameRate(String frameRate) {
		this.frameRate = frameRate;
	}
	public String getFrameRateUpperThreshold() {
		return frameRateUpperThreshold;
	}
	public void setFrameRateUpperThreshold(String frameRateUpperThreshold) {
		this.frameRateUpperThreshold = frameRateUpperThreshold;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getFadeIn() {
		return fadeIn;
	}
	public void setFadeIn(String fadeIn) {
		this.fadeIn = fadeIn;
	}
	public String getFadeOut() {
		return fadeOut;
	}
	public void setFadeOut(String fadeOut) {
		this.fadeOut = fadeOut;
	}
	public String getCropLeft() {
		return cropLeft;
	}
	public void setCropLeft(String cropLeft) {
		this.cropLeft = cropLeft;
	}
	public String getCropRight() {
		return cropRight;
	}
	public void setCropRight(String cropRight) {
		this.cropRight = cropRight;
	}
	public String getCropTop() {
		return cropTop;
	}
	public void setCropTop(String cropTop) {
		this.cropTop = cropTop;
	}
	public String getCropBottom() {
		return cropBottom;
	}
	public void setCropBottom(String cropBottom) {
		this.cropBottom = cropBottom;
	}
	public KeepAspectRatio getKeepAspectRatio() {
		return keepAspectRatio;
	}
	public void setKeepAspectRatio(KeepAspectRatio keepAspectRatio) {
		this.keepAspectRatio = keepAspectRatio;
	}
	public Hint getHint() {
		return hint;
	}
	public void setHint(Hint hint) {
		this.hint = hint;
	}
	public String getRcInitOccupancy() {
		return rcInitOccupancy;
	}
	public void setRcInitOccupancy(String rcInitOccupancy) {
		this.rcInitOccupancy = rcInitOccupancy;
	}
	public String getMinRate() {
		return minRate;
	}
	public void setMinRate(String minRate) {
		this.minRate = minRate;
	}
	public String getMaxRate() {
		return maxRate;
	}
	public void setMaxRate(String maxRate) {
		this.maxRate = maxRate;
	}
	public String getBufSize() {
		return bufSize;
	}
	public void setBufSize(String bufSize) {
		this.bufSize = bufSize;
	}
	public String getKeyFrame() {
		return keyFrame;
	}
	public void setKeyFrame(String keyFrame) {
		this.keyFrame = keyFrame;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getForceKeyFrame() {
		return forceKeyFrame;
	}
	public void setForceKeyFrame(String forceKeyFrame) {
		this.forceKeyFrame = forceKeyFrame;
	}
	public String getBfFrames() {
		return bfFrames;
	}
	public void setBfFrames(String bfFrames) {
		this.bfFrames = bfFrames;
	}
	public Gop getGop() {
		return gop;
	}
	public void setGop(Gop gop) {
		this.gop = gop;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	public List<String> getDestinationList() {
		return destinationList;
	}
	public void setDestinationList(List<String> destinationList) {
		this.destinationList = destinationList;
	}
	public Logo getLogo() {
		return logo;
	}
	public void setLogo(Logo logo) {
		this.logo = logo;
	}
	public List<Overlay> getOverlayList() {
		return overlayList;
	}
	public void setOverlayList(List<Overlay> overlayList) {
		this.overlayList = overlayList;
	}
	public List<TextOverlay> getTextOverlayList() {
		return textOverlayList;
	}
	public void setTextOverlayList(List<TextOverlay> textOverlayList) {
		this.textOverlayList = textOverlayList;
	}
	public String getVideoCodecParameter() {
		return videoCodecParameter;
	}
	public void setVideoCodecParameter(String videoCodecParameter) {
		this.videoCodecParameter = videoCodecParameter;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	public Turbo getTurbo() {
		return turbo;
	}
	public void setTurbo(Turbo turbo) {
		this.turbo = turbo;
	}
	public String getRotate() {
		return rotate;
	}
	public void setRotate(String rotate) {
		this.rotate = rotate;
	}
	public String getSetRotate() {
		return setRotate;
	}
	public void setSetRotate(String setRotate) {
		this.setRotate = setRotate;
	}
	public String getAudioSync() {
		return audioSync;
	}
	public void setAudioSync(String audioSync) {
		this.audioSync = audioSync;
	}
	public VideoSync getVideoSync() {
		return videoSync;
	}
	public void setVideoSync(VideoSync videoSync) {
		this.videoSync = videoSync;
	}
	public ForceInterlaced getForceInterlaced() {
		return forceInterlaced;
	}
	public void setForceInterlaced(ForceInterlaced forceInterlaced) {
		this.forceInterlaced = forceInterlaced;
	}
	public StripChapters getStripChapters() {
		return stripChapters;
	}
	public void setStripChapters(StripChapters stripChapters) {
		this.stripChapters = stripChapters;
	}
	
}
