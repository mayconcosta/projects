package br.com.videoconverter.videoconverter.bo.encoder.enconding;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.videoconverter.videoconverter.bo.encoder.enconding.request.Action;
import br.com.videoconverter.videoconverter.bo.encoder.enconding.request.Format;
import br.com.videoconverter.videoconverter.bo.encoder.enconding.request.Query;
import br.com.videoconverter.videoconverter.bo.encoder.enconding.response.AddMediaResponse;
import br.com.videoconverter.videoconverter.bo.encoder.enconding.response.GetMediaInfoResponse;
import br.com.videoconverter.videoconverter.bo.encoder.enconding.response.GetStatusResponse;
import br.com.videoconverter.videoconverter.bo.encoder.enconding.response.Response;
import br.com.videoconverter.videoconverter.model.Video;

/**
 * Classe para comunicação com o serviço de codificação de vídeo Enconding.
 * @author maycon
 *
 */
public class Encoding {

	// TODO: Colocar essas informações em arquivo de properties.
	private static final String USER_ID="44545";
	private static final String USER_KEY="a5cc0e53f7029506a9d4237276db9e79";
	private static final String SERVER_URL = "http://manage.encoding.com";
	
	private JAXBContext jaxbContext;
	private Marshaller jaxbMarshaller;
	
	public Encoding() throws Exception {
		jaxbContext = JAXBContext.newInstance(Query.class);
		jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	}
	
	public AddMediaResponse addVideo(Video video) {
		try {
			Format format = new Format();
			format.setOutput(video.getFormat().getName());
			
			Query query = new Query();
			query.setAction(Action.AddMedia);
			query.setUserId(USER_ID);
			query.setUserKey(USER_KEY);
			query.addSource(video.getSourceUrl());
			query.setFormat(format);
			
			String xmlRequest = createXmlRequest(query);
			InputStream responseInput = this.sendRequest(xmlRequest);
			
			JAXBContext jaxbContext = JAXBContext.newInstance(AddMediaResponse.class);
			AddMediaResponse response = (AddMediaResponse) jaxbContext.createUnmarshaller().unmarshal(responseInput);
			return response;
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}


	public Response cancelVideo(Video video) {
		try {
			Query query = new Query();
			query.setMediaId(video.getId());
			query.setUserId(USER_ID);
			query.setUserKey(USER_KEY);
			query.setAction(Action.CancelMedia);
			
			String xmlRequest = createXmlRequest(query);
			InputStream responseInput = this.sendRequest(xmlRequest);
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
			Response response = (Response) jaxbContext.createUnmarshaller().unmarshal(responseInput);
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public GetMediaInfoResponse getVideoInfo(Video video) {
		try {
			Query query = new Query();
			query.setMediaId(video.getId());
			query.setUserId(USER_ID);
			query.setUserKey(USER_KEY);
			query.setAction(Action.GetMediaInfo);
			
			String xmlRequest = createXmlRequest(query);
			InputStream responseInput = this.sendRequest(xmlRequest);
			
			JAXBContext jaxbContext = JAXBContext.newInstance(GetMediaInfoResponse.class);
			GetMediaInfoResponse response = (GetMediaInfoResponse) jaxbContext.createUnmarshaller().unmarshal(responseInput);
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public GetStatusResponse getStatus(Video video) {
		try {
			Query query = new Query();
			query.setMediaId(video.getId());
			query.setUserId(USER_ID);
			query.setUserKey(USER_KEY);
			query.setAction(Action.GetStatus);
			
			String xmlRequest = createXmlRequest(query);
			InputStream responseInput = this.sendRequest(xmlRequest);
			
			JAXBContext jaxbContext = JAXBContext.newInstance(GetStatusResponse.class);
			GetStatusResponse response = (GetStatusResponse) jaxbContext.createUnmarshaller().unmarshal(responseInput);
			return response;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	/**
	 * Envia uma mensagem xml para o servidor do Encoding e retorna um inputStream com a resposta.
	 * @param xmlRequest Requisição xml
	 * @return xml resposta
	 * @throws Exception
	 */
	private InputStream sendRequest(String xmlRequest) throws Exception {
		String encodedXml = URLEncoder.encode(xmlRequest, "UTF-8");
		URL server = new URL(SERVER_URL);
		HttpURLConnection connection = (HttpURLConnection) server.openConnection();
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);
		connection.setConnectTimeout(60000);
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		
		BufferedWriter out = new BufferedWriter( new OutputStreamWriter( connection.getOutputStream() ) );
		out.write("xml=" + encodedXml);
		out.flush();
		out.close();
		
		connection.connect();
		if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
			throw new Exception(connection.getResponseMessage());
		}
		return connection.getInputStream();
	}
	
	private String createXmlRequest(Query query) throws JAXBException {
		StringWriter stringWriter = new StringWriter();
		jaxbMarshaller.marshal(query, stringWriter);
		String xml = stringWriter.toString();
		stringWriter.flush();
		return xml;
	}
}
