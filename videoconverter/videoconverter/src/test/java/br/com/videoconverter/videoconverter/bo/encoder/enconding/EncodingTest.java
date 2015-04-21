package br.com.videoconverter.videoconverter.bo.encoder.enconding;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.videoconverter.videoconverter.bo.encoder.enconding.response.AddMediaResponse;
import br.com.videoconverter.videoconverter.bo.encoder.enconding.response.GetMediaInfoResponse;
import br.com.videoconverter.videoconverter.bo.encoder.enconding.response.GetStatusResponse;
import br.com.videoconverter.videoconverter.model.Video;
import br.com.videoconverter.videoconverter.model.VideoFormat;

public class EncodingTest {

	//@Test
	public void testAddVideo() {
		try {

			Video video = new Video();
			video.setFormat(VideoFormat.MP4);
			video.setSourceUrl("http://dinamica-sambatech.s3.amazonaws.com/sample.dv");
			Encoding encoding = new Encoding();
			AddMediaResponse response = (AddMediaResponse)encoding.addVideo(video);
			
			assertNull(response.getErrors());
			assertNotNull(response.getMediaId());
			assertNotNull(response.getMessage());
			assertEquals("Added", response.getMessage());

		} catch (Exception e) {
			fail(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

	//@Test
	public void testCancelVideo() {
		//fail("Not yet implemented");
	}
	
	//@Test
	public void testGetStatus() throws Exception {
		Video video = new Video();
		video.setFormat(VideoFormat.MP4);
		video.setSourceUrl("http://dinamica-sambatech.s3.amazonaws.com/sample.dv");
		Encoding encoding = new Encoding();
		//AddMediaResponse response = (AddMediaResponse)encoding.addVideo(video);
		
		//assertNotNull(response.getMediaId());
		//video.setId(response.getMediaId());
		video.setId("37937622");
		GetStatusResponse status = (GetStatusResponse)encoding.getStatus(video);
		assertNotNull(status);
		assertNull(status.getErrors());
	}

	//@Test
	public void testGetVideoInfo() throws Exception {
		Video video = new Video();
		video.setFormat(VideoFormat.MP4);
		video.setSourceUrl("http://dinamica-sambatech.s3.amazonaws.com/sample.dv");
		Encoding encoding = new Encoding();
		AddMediaResponse response = (AddMediaResponse)encoding.addVideo(video);
		
		assertNotNull(response.getMediaId());
		video.setId(response.getMediaId());
		GetMediaInfoResponse infoResponse = (GetMediaInfoResponse)encoding.getVideoInfo(video);
		assertNotNull(infoResponse);
		assertNull(infoResponse.getErrors());
	}

	//@Test
	public void testStopVideo() {
		//fail("Not yet implemented");
	}

}
