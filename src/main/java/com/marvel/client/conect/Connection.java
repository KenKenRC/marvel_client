package com.marvel.client.conect;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.marvel.client.utils.Crypto;

public class Connection implements IConnection{

	@Value("${url.api.marvel}")
	private String url;
	
	@Value("${url.api.marvel.characters}")
	private String characters;
	
	@Value("${url.api.marvel.charactersId}")
	private String charactersId;
	
	@Value("${public.apikey}")
	private String apikey;

	@Value("${timestamp}")
	private String ts;
	
	@Override
	public String getComicCharacters() {
		String hash = Crypto.getHashMD5(ts, apikey);
		WebClient.RequestBodySpec  requestServicio = WebClient.create(url).method(HttpMethod.GET).uri(uriBuilder -> uriBuilder.path(characters).queryParam("apikey", apikey).queryParam("hash", hash).queryParam("ts", ts).build());
		ClientResponse clientResponse = requestServicio.exchange().block();
		String bodyRespuesta = clientResponse.bodyToMono(String.class).block();
		
		return bodyRespuesta;
	}

	@Override
	public String getComicCharactersId(int id) {
		String hash = Crypto.getHashMD5(ts, apikey);
		WebClient.RequestBodySpec  requestServicio = WebClient.create(url).method(HttpMethod.GET).uri(uriBuilder -> uriBuilder.path(charactersId).queryParam("apikey", apikey).queryParam("hash", hash).queryParam("ts", ts).build(id));
		ClientResponse clientResponse = requestServicio.exchange().block();
		String bodyRespuesta = clientResponse.bodyToMono(String.class).block();
		
		return bodyRespuesta;
	}


}

